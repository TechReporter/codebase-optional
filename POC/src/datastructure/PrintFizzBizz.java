/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jan 20, 2020
 */
public class PrintFizzBizz {

	// print fizz if divide by 3 only, print bizz if divide by 5 only
	//print fizzbizz if divide by 3,5, without if else
	public static void main(String[] args) {
		int[] arr= {6,9,10,7,15,21,25,28};

		String[][] incr = {{"","fizz"},
						   {"bizz","fizzbizz"}};

		for(int i=0;i<arr.length;i++) {
			System.out.println(incr[arr[i]%3][arr[i]%5]);
		}
	}

}
