/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author 212720190
 * @date Mar 31, 2020
 */
public class TweetCountPerFreq {
	Map<String, TreeSet<Integer>> tweetMap;
	private Map<String, Integer> accordance = new HashMap() {{
		put("minute", 60);
		put("hour", 3600);
		put("day", 86400);
	}};;
	public TweetCountPerFreq() {
		tweetMap = new HashMap<>();
	}
	public void recordTweet(String tweetName, int time) {
		if(tweetMap.get(tweetName)!=null) {
			TreeSet<Integer> tweetSet = tweetMap.get(tweetName);
			tweetSet.add(time);
			tweetMap.put(tweetName, tweetSet);
		} else {
			TreeSet<Integer> tweetSet = new TreeSet<>();
			tweetSet.add(time);
			tweetMap.put(tweetName, tweetSet);
		}
	}

	public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
		int interval = accordance.get(freq);
		List<Integer> result = new ArrayList<>();
		TreeSet<Integer> tweetSet = tweetMap.get(tweetName);
		int slot = (endTime-startTime)/interval;
		for(int i=0;i<=slot;i++) {
			int count=0;
			int startInterVal = startTime+slot*i;
			int endTimeInterval = Math.min(startTime+slot*(i+1)-1,endTime+1);

			for(Integer tweet : tweetSet) {
				if(tweet>=startInterVal && tweet<=endTimeInterval)
					count++;
			}
			result.add(count);
		}
		return result;
	}

	public static void main(String[] args) {
		TweetCountPerFreq tweetCounts = new TweetCountPerFreq();
		tweetCounts.recordTweet("tweet3", 0);
		tweetCounts.recordTweet("tweet3", 60);
		tweetCounts.recordTweet("tweet3", 10); 
		tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59).stream()
										.forEach(System.out::println);
	}

}
