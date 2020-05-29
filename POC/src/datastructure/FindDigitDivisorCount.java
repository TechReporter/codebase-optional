/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 29, 2019
 */
public class FindDigitDivisorCount {

	
	public static void main(String[] args) {

		int n=106108048;
		int count=0;
		int val = n;
		while(n>0) {
			int rem = n%10;
			if(rem!=0 && val%rem==0) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
	}

}
