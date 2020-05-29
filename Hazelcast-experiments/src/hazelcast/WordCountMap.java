/**
 * 
 */
package hazelcast;

import static com.hazelcast.jet.Traversers.traverseArray;

import java.util.Map;

import com.hazelcast.core.IList;
import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import com.hazelcast.jet.aggregate.AggregateOperations;
import com.hazelcast.jet.core.DAG;
import com.hazelcast.jet.pipeline.Pipeline;
import com.hazelcast.jet.pipeline.Sinks;
import com.hazelcast.jet.pipeline.Sources;

import util.CustomFunction;

/**
 * @author 212720190
 * @date Sep 1, 2019
 */
public class WordCountMap {

	public static void main(String[] args) {
		JetInstance jet = Jet.newJetInstance();
		try {
			IList<String> textData = jet.getList("DataList");
			textData.add("hello world hello tanmoy hello world");
			textData.add("world world hello mani world mani");
			
			jet.newJob(createPipelineJob()).join();
			
			Map<String, Long> map = jet.getMap("counts");
			
			 System.out.println(map.get("hello"));
			 System.out.println(map.get("world"));
			 System.out.println(map.get("tanmoy"));
			 System.out.println(map.get("mani"));

		} finally {
			Jet.shutdownAll();
		}
		

	}
	
	private static DAG createPipelineJob() {
		Pipeline pLine = Pipeline.create();
		pLine.drawFrom(Sources.<String>list("DataList"))
		.flatMap(data -> traverseArray(data.toLowerCase().split("\\W+")))
		.filter(word -> !word.isEmpty())
        .groupingKey(CustomFunction.customWholeItem())
        .aggregate(AggregateOperations.counting())
        .drainTo(Sinks.map("counts"));
		
		return pLine.toDag();
	}

}
