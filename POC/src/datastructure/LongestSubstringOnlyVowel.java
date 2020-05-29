/**
 * 
 */
package datastructure;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author 212720190
 * @date Jul 6, 2019
 */
public class LongestSubstringOnlyVowel {


	public static void main(String[] args) {
		String str = "abcaac";
		int temp = Integer.MIN_VALUE;
		String res = "";
		for(int i=0;i<str.length();i++) {
			String cc = "";
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				cc=cc.concat(String.valueOf(str.charAt(i)));
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(j)=='a'|| str.charAt(j)=='e'||str.charAt(j)=='i'
							||str.charAt(j)=='o'||str.charAt(j)=='u') {
						cc=cc.concat(String.valueOf(str.charAt(j)));
					}
					else {
						break;
					}
				}
				if(temp<cc.length()) {
					temp = cc.length();
					res = cc;
				}
			}
		}
		System.out.println(temp+" "+res);


		String[] arr = {"12303479849857341718340192371","3084193741082937","3084193741082938",
				"100","2","200","111"};

		BigInteger[] bigInt = new BigInteger[arr.length];
	    String[] str1 = new String[arr.length];


		for(int i=0;i<arr.length;i++) {
			BigInteger bb = new BigInteger(arr[i]);
			bigInt[i] = bb;
		}

		Arrays.sort(bigInt);
		for(int i=0;i<bigInt.length;i++) {
			System.out.println(bigInt[i]);
			System.out.println();
		}
		
		
	
		
		

	}

}
