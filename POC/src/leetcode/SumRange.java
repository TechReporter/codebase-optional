/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class SumRange {

	public static void main(String[] args) {
		int[] arr = {-2, 0, 3, -5, 2, -1};
		int sum=0;
		for(int k=2;k<=5;k++) {
            sum+=arr[k];
        }
        System.out.println(sum);

	}

}
