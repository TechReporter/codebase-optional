/**
 * 
 */
package hazelcast;

import java.io.File;
import java.util.Arrays;

import com.hazelcast.core.IList;
import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import com.hazelcast.jet.pipeline.Pipeline;
import com.hazelcast.jet.pipeline.Sinks;
import com.hazelcast.jet.pipeline.Sources;

/**
 * @author 212720190
 * @date Sep 1, 2019
 */
public class TransformListData {
	
	
	
		public static void main(String[] args) {
		JetInstance jet = Jet.newJetInstance();
		final String DIRECTORY = "C:/Users/212720190/Desktop/hazelcast training/hazelcast-jet-training-master/data1";
		Pipeline pLine = Pipeline.create();
		pLine.drawFrom(Sources.<String>list("SourceList"))
		.map(String::toUpperCase)
		.drainTo(Sinks.filesBuilder(DIRECTORY).build());
		
		try {
			IList<String> listData = jet.getList("SourceList");
			listData.addAll(Arrays.asList("tanmoy","dasgupta"));
			jet.newJob(pLine).join();
			renameFile(DIRECTORY);
			
		} finally {
			Jet.shutdownAll();
		}

	}
		static void renameFile(String srcDir) {
			File srcFile = new File(srcDir.concat("/0"));
			File dstFile = new File(srcDir.concat("/output.txt"));
			if(srcFile.renameTo(dstFile))
				System.out.println("SUCCESS!!");

		}
}
