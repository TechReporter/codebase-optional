/**
 * 
 */
package hazelcast;

import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import com.hazelcast.jet.pipeline.Pipeline;
import com.hazelcast.jet.pipeline.Sinks;
import com.hazelcast.jet.pipeline.Sources;

/**
 * @author 212720190
 * @date Sep 2, 2019
 */
public class RealTimeDataWatcher {
	
	public static void main(String[] args) {
	JetInstance jet = Jet.newJetInstance();
	final String DST_DIRECTORY = "C:/Users/212720190/Desktop/hazelcast training/hazelcast-jet-training-master/data1";
    final String SRC_DIRECTORY = "C:\\Users\\212720190\\Desktop\\hazelcast training\\hazelcast-jet-training-master\\data";

	Pipeline pLine = Pipeline.create();
	pLine.drawFrom(Sources.fileWatcher(SRC_DIRECTORY))
	.withoutTimestamps()
	.map(String::toUpperCase)
	.drainTo(Sinks.filesBuilder(DST_DIRECTORY).build());
	
	try {
		jet.newJob(pLine).join();
		
	} finally {
		Jet.shutdownAll();
	}

}


	
}
