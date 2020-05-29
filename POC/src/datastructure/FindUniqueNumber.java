/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 27, 2019
 */
public class FindUniqueNumber {

	//find only unique number, where every other element appear twice
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};

		int val = 0;
		for(int i=0;i<nums.length;i++) {
			val^=nums[i];
		}
		System.out.println(val);
	}

}
