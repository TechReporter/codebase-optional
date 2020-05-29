/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jul 5, 2019
 */
public class ReverseNumber {

	public static void main(String[] args) {

		int a  = 435;
		int reverseNum = 0;
		int rem = 0;
		while(a !=0) {
			rem = a%10;
			reverseNum = reverseNum*10+rem;
			a=a/10;
		}
		System.out.println(reverseNum);

		System.out.println(Math.abs(32-46));
		System.out.println(15%6);

	}
}
