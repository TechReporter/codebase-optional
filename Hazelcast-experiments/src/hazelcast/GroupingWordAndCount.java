/**
 * 
 */
package hazelcast;

import java.util.Arrays;

import com.hazelcast.core.IList;
import com.hazelcast.core.IMap;
import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import com.hazelcast.jet.aggregate.AggregateOperations;
import com.hazelcast.jet.pipeline.Pipeline;
import com.hazelcast.jet.pipeline.Sinks;
import com.hazelcast.jet.pipeline.Sources;

/**
 * @author 212720190
 * @date Sep 2, 2019
 */
public class GroupingWordAndCount {

	public static void main(String[] args) {
		
		try {
			JetInstance jet = Jet.newJetInstance();
			IList<String> list = jet.getList("LISTDATA");
			list.addAll(Arrays.asList("mani","tanmoy","welcome","dankuni"));

			IMap<Integer, Long> histogram = jet.getMap("histogram");
			
			Pipeline pLine = Pipeline.create();
			pLine.drawFrom(Sources.list(list))
			.groupingKey(String::length)
			.aggregate(AggregateOperations.counting())
			.drainTo(Sinks.map(histogram));

			jet.newJob(pLine).join();
			
			histogram.forEach((length, count) -> System.out.format(
			        "%d chars: %d occurrences%n", length, count));
			
		} finally {
			Jet.shutdownAll();
		}
	}
}
