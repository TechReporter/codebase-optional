import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author 212720190
 * @date Feb 15, 2020
 */
public class LogStorageUtil {
	
	public class Log {
		int id;
		String timeStamp;
		
		public Log(int id, String timeStamp) {
			this.id = id;
			this.timeStamp = timeStamp;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
		
	}
	
	String[] time;
	int[] timeIndex = {4,7,10,13,16,19};
	Map<String, Integer> timeMap;
	List<Log> logEntry;
	
	public LogStorageUtil(String input) {
		logEntry = new ArrayList<>();
		initializeTime(input);
	}
	
	
	private void initializeTime(String inputTime) {
		time = inputTime.split(":");
		timeMap = new HashMap<>();
		for(int i=0;i<time.length;i++) {
			timeMap.put(time[i], timeIndex[i]);
		}
	}
	
	public void put(int id, String timestamp) {
		logEntry.add(new Log(id, timestamp));
	}
	
	public List<Integer> logRetrive(String low, String high, String type) {
		List<Integer> result = new ArrayList<>();
		int index = timeMap.get(type);
		String start = low.substring(0,index);
		String end = high.substring(0, index);
		
		for(Log log : logEntry) {
			String timeStamp = log.getTimeStamp();
			if(timeStamp.substring(0, index).compareTo(start)>=0 &&
					timeStamp.substring(0, index).compareTo(end)<=0) {
				result.add(log.getId());
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	
		LogStorageUtil logStorage = new LogStorageUtil("Year:Month:Day:Hour:Minute:Second");
		logStorage.put(1, "2017:01:01:23:59:59");
		logStorage.put(2, "2017:01:01:22:59:59");
		logStorage.put(3, "2016:01:01:00:00:00");
		System.out.println(logStorage.logRetrive("2016:01:01:01:01:01","2017:01:01:23:00:00","Year"));
	}

	
}
