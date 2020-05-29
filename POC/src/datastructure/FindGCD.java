package datastructure;

/**
 * @author 212720190
 * @date May 26, 2019
 */
public class FindGCD {


	public static void main(String[] args) {

		int res = findGcd(9, 15);
		System.out.println(findGcd(res, 6));
	}
	static int findGcd(int a, int b) {
		if(a ==0 || b==0) {
			return 0;
		}
		if(a==b)
			return b;
		
		if(a>b) {
			return findGcd(a-b, b);
		} else {
			return findGcd(a, b-a);
		}
			
	}

}
