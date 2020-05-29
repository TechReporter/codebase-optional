package Arraypractice;

/**
 * @author 212720190
 * @date Jan 30, 2020
 */
public class SubArrayWithGivenSum {

	//find subarray with given sum present
	public static void main(String[] args) {
		int[] arr = {2,10,8,7,14,1};
		
		int leftP = 0;
		int rightP = 0;
		int currentSum = 0;
		int res = 25;
		while(rightP<arr.length) {
			if(currentSum>res) {
				currentSum-=arr[leftP];
				leftP++;
			} else {
				currentSum+=arr[rightP];
				rightP++;
			}
			if(currentSum==res)
				break;
		}
		System.out.println("left index "+leftP+" right index "+(rightP-1));
		
	}

}
