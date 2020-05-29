/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 5, 2019
 */
public class FindMissingNumber {
	
	public static void main(String[] args) {

	int[] arr = {4,1,6,3,7,2};
		
	int total = 1;
	
	for(int i=2;i<=arr.length+1;i++) {
		total+=i;
		total-=arr[i-2];
	}
	System.out.println(total);
	}

}
