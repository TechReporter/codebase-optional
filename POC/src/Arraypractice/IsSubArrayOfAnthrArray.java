/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 20, 2020
 */
public class IsSubArrayOfAnthrArray {


	public static void main(String[] args) {
		int[] arr1 = {3,0,5,7};
		int[] arr2 = {2,3,0,5,6,1,2,3,0,5,7};

		int count=0;
		int k=0;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==arr1[k++]) {
				count++;
				if(count==arr1.length) {
					System.out.println("yes");
					break;	
				}
			}else {
				count=0;
				k=0;
			}
		}

	}

}
