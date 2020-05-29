/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class MissingNumberInArray {

	// identify missing numbers in array, assuming there r 4 missing number
	public static void main(String[] args) {

		int[] arr = {1,4,2,7,9};
		int[] temp = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]=1;
		}
		
		for(int i=1;i<temp.length;i++) {
			if(temp[i]==0) {
				System.out.println("missing number "+i);
			}
		}
	}

}
