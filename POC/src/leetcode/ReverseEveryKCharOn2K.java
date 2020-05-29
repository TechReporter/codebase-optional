package leetcode;

/**
 * @author 212720190
 * @date Jul 27, 2019
 */
public class ReverseEveryKCharOn2K {

	//Given a string and an integer k, you need to reverse the first k
	//characters for every 2k characters counting from the start of the string.
	//If there are less than k characters left, reverse all of them. 
	//If there are less than 2k but greater than or equal to k characters,
	//then reverse the first k characters and left the other as original.
	
	public static void main(String[] args) {

		String s = "abcdefg";
		int k=2;
		String result = "";
		for(int j=0;j<s.length();j+=2*k) {
			String ss = s.substring(j, Math.min(j+k, s.length()));
			int i=0;
			int m=ss.length()-1;
			char[] chr = ss.toCharArray();
			while(i<m) {
				char temp = chr[i];
				chr[i] = chr[m];
				chr[m] =  temp;
				i++;
				m--;
			}
			if(j+k<s.length()) {
				result = result.concat(String.valueOf(chr))
						.concat(s.substring(j+k, Math.min(j+2*k, s.length())));
			} else {
				result = result.concat(String.valueOf(chr));
			}
		
		}
		System.out.println(result);
	
	}

}
