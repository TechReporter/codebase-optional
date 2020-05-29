/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Apr 1, 2020
 */
public class AlternateBitSet {


	public static void main(String[] args) {
		String str = getBinary(5);
		boolean flag=true;
		int face=2;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1') {
				if(face==1) {
					flag=false;
					break;
				} else {
					face=1;
				}			
			}
			if(str.charAt(i)=='0') {
				if(face==0) {
					flag=false;
					break;
				} else {
					face=0;
				}		
			} 

		}
		
		//another way
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				flag=false;
				break;	
			}
		}
	}
	
	static String getBinary(int n) {
		StringBuilder sb = new StringBuilder();
		
		while(n>0) {
			int rem = n%2;
			sb = sb.append(String.valueOf(rem));
			n/=2;
		}
		return sb.reverse().toString();
	}

}
