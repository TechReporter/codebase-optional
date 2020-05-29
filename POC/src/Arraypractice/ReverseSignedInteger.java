/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class ReverseSignedInteger {


	public static void main(String[] args) {
		int a = 1534236469;
		boolean isNegetive=false;
		if(a<0) {
			isNegetive=true;
			a=0-a;
		}
		int res=0;
		while(a>0) {
			int rem= a%10;
			res=res*10+rem;
			a/=10;
		} if(res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10)
			System.out.println(0);
		if(isNegetive) {
			System.out.println(res*(-1));
		}else
			System.out.println(res);
	}

}
