package Arraypractice;

/**
 * @author 212720190
 * @date Mar 18, 2020
 */
public class SmallstSbArryGrtrSum {

	
	public static void main(String[] args) {
		// smallest subarray for which sum greater than k
		int[] arr = {1,2,3,4,5,6,7,8};
		int k=21;
		int sum=0;
		int left =0;
		int right=0;
		int len=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			right++;
			while(sum>k && left<=right) {
				len=Math.min(len, (right-left));
				sum-=arr[left];
				left++;
			}
		}
		System.out.println("sub aray length "+len);
		for (int i = left-1; i <right; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
