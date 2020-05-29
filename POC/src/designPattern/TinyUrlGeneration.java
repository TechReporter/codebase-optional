package designPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Aug 10, 2019
 */
public class TinyUrlGeneration {

	static String str ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	static char[] chr = str.toCharArray();
	final static int prefix_num = 1234;
	
	
//tiny url generation base62 character
	public static void main(String[] args) {
		Map<Long, String> map_url = new HashMap<>();
		String url = "https://www.kerstner.at/2012/07/shortening-strings-using-base-62-encoding/";
		long number = generateNumber();
		String tinyUrl = convertToStringFromBase62(number);
		map_url.put(number, url);
		System.out.println("tinu url : "+tinyUrl);
		long rev_number = convertToBase62FromString(tinyUrl);
		String rev_url = map_url.get(rev_number);
		System.out.println("main url "+rev_url);
	}

	static long generateNumber() {
		long num = Long.valueOf(prefix_num+System.currentTimeMillis());
		return num;
	}
	
	static String convertToStringFromBase62(long number) {
		String hash_url="";
		while(number>0) {
			hash_url+=(str.charAt((int)(number%62)));
			number/=62;
		}
		return hash_url;
	}
	
	static long convertToBase62FromString(String url) {
		long number=0L;
		for(int i=url.length()-1;i>=0;i--) {
			int index = str.indexOf(url.charAt(i));
			number+=index*(long)Math.pow(62, i);
		}
		return number;
	}
	
}
