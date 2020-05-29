/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 26, 2019
 */
public class WaysToClimbStairs {

	public static void main(String[] args) {

		int stairs = 4,at_a_time_max=2;
		
		int[] arr = new int[stairs+1];
		arr[0] =1;arr[1]=1;
		
		for(int i=2;i<stairs;i++) {
			arr[i]=0;
			for(int j=1;j<=at_a_time_max && j<=i;j++) {
				arr[i]+=arr[i-j];
			}
		}
		System.out.println(arr[stairs-1]);
		
	}

}
