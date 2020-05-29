/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Dec 12, 2019
 */
//min no. platform required in a given time
public class MaxPlatformReqInTime {


	public static void main(String[] args) {
		double arr[]  = {9.00,  9.40, 9.50,  11.00, 15.00, 18.00};
		double dep[]  = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};

		Arrays.sort(arr);
		Arrays.sort(dep);

		int platform = 1;
		int arrival = 1;
		int dept = 0;
		int count=1;


		while(arrival<arr.length) {

			if(arr[arrival]<=dep[dept]) {
				arrival++;
				platform++;
			}
			
			else  {
				dept++;
				platform--;
			}
			count = Math.max(count, platform);
		}
		System.out.println(count);

	}

}
