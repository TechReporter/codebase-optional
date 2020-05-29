package Arraypractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 212720190
 * @date Mar 19, 2020
 */
public class CompanyName {


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
            int N = Integer.parseInt(br.readLine().trim());
            int i=0;
            String[] A = new String[N];
            for(int t_i=0; t_i<N; t_i++)
            {
            String arr_A = br.readLine();
            	A[i++] = arr_A;
        }
            test(A);
		
	}
	
	static String test(String[] arr) {
		int[] chr = new int[26];
		for(int i=0;i<arr.length;i++) {
			char[] c = arr[i].toCharArray();
			for(int j=0;j<c.length;j++) {
				chr[c[j]-'a']++;
			}
		}
		for(int m=0;m<chr.length;m++) {
			if(chr[m]==0) {
				return String.valueOf((char)(m+97));
			}
		}
		return "-1";
	}
	
}
