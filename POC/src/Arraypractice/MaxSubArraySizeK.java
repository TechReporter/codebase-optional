/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 4, 2020
 */
public class MaxSubArraySizeK {

	//max sub array with sum with size k
	//find max possible subarray with size k window
	public static void main(String[] args) {
		
		getMax();
		getMin();
	}

	
	private static void getMax() {
		int[] arr = {4,2,5,2,10,5,3,9};
		int k=3;
		int curr_sum=0;
		int result=0;
		for(int i=0;i<k;i++) {
			curr_sum+=arr[i];
		}
		result=curr_sum;
		int start =0;
		int end=k-1;
		for(int j=k;j<arr.length;j++) {
			curr_sum+=arr[j]-arr[j-k];
			if(result<curr_sum) {
				result = curr_sum;
				start=j-k+1;
				end=j;
			}
		}
		System.out.println("result::"+result+" start: "+start+" end: "+end);
	}
	
	private static void getMin() {
		int[] arr = {4,2,5,2,10,5,3,9};
		int k=3;
		int curr_sum=0;
		int result=0;
		for(int i=0;i<k;i++) {
			curr_sum+=arr[i];
		}
		result=curr_sum;
		int start =0;
		int end=k-1;
		for(int j=k;j<arr.length;j++) {
			curr_sum+=arr[j]-arr[j-k];
			if(result>curr_sum) {
				result = curr_sum;
				start=j-k+1;
				end=j;
			}
		}
		System.out.println("result::"+result+" start: "+start+" end: "+end);
	}

}
