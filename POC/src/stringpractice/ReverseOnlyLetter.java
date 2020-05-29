/**
 * 
 */
package stringpractice;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
public class ReverseOnlyLetter {

	//reverse only letter. skip any special character
	//a-bC-dEf-ghIj-->j-Ih-gfE-dCba
	public static void main(String[] args) {
		String str = "a-bC-dEf-ghIj";
		int p1=0;
		int p2=str.length()-1;
		char[] ch = str.toCharArray();
		while(p1<p2) {
			if(Character.isLetter(str.charAt(p1)) && Character.isLetter(str.charAt(p2))) {
				 char temp = ch[p1];
				 ch[p1] = ch[p2];
				 ch[p2] = temp;
				 p1++;
				 p2--;
		} else if(!Character.isLetter(str.charAt(p1))) {
			p1++;
		} else {
			p2--;
		}
	}
		System.out.println(String.valueOf(ch));
	}

}
