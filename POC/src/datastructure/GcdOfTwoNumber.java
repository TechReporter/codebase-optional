/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jan 21, 2020
 */
public class GcdOfTwoNumber {


	public static void main(String[] args) {

		System.out.println(getGcd(20, 30));
	}
	
	static int getGcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return getGcd(b,a%b);
	}

}
