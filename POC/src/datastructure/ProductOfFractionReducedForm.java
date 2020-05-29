package datastructure;

/**
 * @author 212720190
 * @date Jan 21, 2020
 */
//product of N fractions, but in reduced form.
//logic is to get product of num, and den, then get gcd. then divide
//each one with gcd to get num_reduce and den_reduce
public class ProductOfFractionReducedForm {
	
	public static void main(String[] args) {

		int[] arr1 = {1,2,5};
		int[] arr2 = {2,1,6};
		
		int j=0;
		int numerator=1;
		int denominator=1;
		
		while(j<arr1.length) {
			numerator*=arr1[j];
			denominator*=arr2[j];
			j++;
		}
		int gcd = getGcd(numerator, denominator);
		int num_frac = numerator/gcd;
		int den_frac = denominator/gcd;
		System.out.println(num_frac+"/"+den_frac);
	}
	static int getGcd(int a, int b) {
		if(b==0)
			return a;
		return getGcd(b, a%b);
	}

}
