package datastructure;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * @author 212720190
 * @date Dec 30, 2019
 */
//find all contigioussubarray with K sum
public class FindAllSubArrayWithKSum {


	public static void main(String[] args) throws MalformedURLException {
	String sss = "https://sitecore.globalcomm.cfadevelop.com/".substring(0, 
			"https://sitecore.globalcomm.cfadevelop.com/".length()-1).trim();
	System.out.println(sss);
		URL url = new URL("https://sitecore.globalcomm.cfadevelop.com/");
		String protocol = url.getProtocol();
		String authority = url.getHost();
		String ss = "https://sitecore.globalcomm.cfadevelop.com/";
		String domainName = authority.substring(0, authority.indexOf('.'));
		System.out.println(protocol+" "+domainName);

	}

	/*

		String date = "20191231T170000Z";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'");

		LocalDateTime publishDate =LocalDateTime.parse(date,formatter);
		System.out.println(publishDate);


				int[] arr = {2,2,6,1,9,8,3,7};
				int start_index=0;
				int sum = 10;
				//int end_index=0;
				int cur_sum=0;
				for(int i=0; i<arr.length;i++) {
					cur_sum+=arr[i];

					while(cur_sum>sum) {
						cur_sum-=arr[start_index];
						start_index++;
					}
					if(cur_sum==sum) {
						int cur_index = start_index;
						while(cur_index<=i) {
							System.out.print(arr[cur_index]+",");
							cur_index++;
						}
						System.out.println();
					}
	
				}
	 */}
