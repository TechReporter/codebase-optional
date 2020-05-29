/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class GetMissingNum {

	//get missing number in constant space
	public static void main(String[] args) {
		int[] nums= {9,6,4,2,3,5,7,0,1};
		//sum all index, then substarct each element from sum
		int sum=0;
		for(int i=0;i<=nums.length;i++) {
			sum+=i;
		}
		for(int i=0;i<nums.length;i++) {
			sum-=nums[i];
		}
		System.out.println(sum);

	}

}
