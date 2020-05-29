/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Feb 10, 2020
 */
public class CountSetBitBinary {

	//brian karnighan algorithm
	public static void main(String[] args) {

		int a = 00000000000000000000000000001011;
		int setBitCount=0;
		while(a>0) {
			a &= a-1;
			setBitCount++;
		}
		System.out.println(setBitCount);
	}

}
