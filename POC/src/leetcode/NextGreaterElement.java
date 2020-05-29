/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 6, 2020
 */
public class NextGreaterElement {
	//556. Next Greater Element III
	//Given a positive 32-bit integer n, you need to find the smallest 32-bit 
	/*integer which has exactly the same digits existing in the integer n and is greater in value than n.
	If no such positive 32-bit integer exists, you need to return -1.*/
	public static void main(String[] args) {
		//if number's digit in descending order, then not possible to get next greate element.
		//if ascending order, then just swap right most two digit. 
		int n=1122;
		String num = String.valueOf(n);
		int i=num.length()-1;
		for(;i>0;i--) {
			if(Integer.parseInt(String.valueOf(num.charAt(i)))
					<Integer.parseInt(String.valueOf(num.charAt(i-1)))) {
				continue;
			} else {
				break;
			}
		}
		if(i==0) {
			System.out.println(-1);
		} else if(i==num.length()-1) {
			char[] chr = num.toCharArray();
			swap(chr, i, i-1);
			String res = String.valueOf(chr);
			if(res.equals(num))
			System.out.println(-1);
			else
				System.out.println(res);
		} else {
			char[] chr = num.toCharArray();
			char x=chr[i-1]; int min=i;
			for(int m=i+1;m<chr.length;m++) {
				if(chr[m]>x && chr[m]<chr[min])
					min=m;
			}
			swap(chr, i-1, min);
			Arrays.sort(chr,i,chr.length);
			String s = String.valueOf(chr);
			System.out.println(Integer.parseInt(s));
		}
	}

	static void swap(char ar[], int i, int j)  
	{
		char temp = ar[i]; 
		ar[i] = ar[j]; 
		ar[j] = temp; 
	} 


}
