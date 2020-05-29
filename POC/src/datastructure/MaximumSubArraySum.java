/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Nov 10, 2019
 */
public class MaximumSubArraySum {

	//kadens algo
	public static void main(String[] args) {
		int[] arr = {1,-3,2,1,-1};
		int sum=0;
		int sumOnIndex = 0;
		int start_index=0,end_index=0;
		for(int i=0;i<arr.length;i++) {
			sumOnIndex+=arr[i];
			if(sumOnIndex<0) {
				sumOnIndex=0;
				start_index=i+1;
			} else if(sum<sumOnIndex) {
				sum=sumOnIndex;
				end_index=i;
			}
		}
		System.out.println(sum);
		System.out.println("start "+start_index);
		System.out.println("end "+end_index);
		for(int i=start_index;i<=end_index;i++) {
			System.out.print(arr[i]+" ");
		}
	}	

}
