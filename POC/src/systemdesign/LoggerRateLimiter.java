package systemdesign;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 8, 2020
 */
public class LoggerRateLimiter {
	Map<String,Integer> map;
	int limiter = 10;

	public LoggerRateLimiter() {
		map = new HashMap<>();
	}

	/*Design a logger system that receive stream of messages along with its timestamps, each message 
	should be printed if and only if it is not printed in the last 10 seconds.*/
	public static void main(String[] args) {
		LoggerRateLimiter logger = new LoggerRateLimiter();
		
		System.out.println(logger.shouldPrintMessage(1, "foo"));
		System.out.println(logger.shouldPrintMessage(2,"bar"));
		System.out.println(logger.shouldPrintMessage(3,"foo"));
		System.out.println(logger.shouldPrintMessage(8,"bar"));
		System.out.println(logger.shouldPrintMessage(10,"foo"));
		System.out.println(logger.shouldPrintMessage(11,"foo"));
	}

	 boolean shouldPrintMessage(int id, String message) {
		if(map.get(message)==null) {
			map.put(message,id);
			return true;
		} else {
			int timestamp = map.get(message);
			if(id-timestamp<limiter)
				return false;
			else {
				map.put(message,id);
				return true;
			}
		}
	}
}
