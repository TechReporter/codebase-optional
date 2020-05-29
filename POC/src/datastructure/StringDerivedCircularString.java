/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 5, 2019
 */
public class StringDerivedCircularString {

	public static void main(String[] args) {

		String str1 = "mnop";
		String str2 = "opmn";
		

		int index =0;
		while(index<str1.length()) {
			if(str1.length() != str2.length())
				break;
			str1 = str1.charAt(str1.length()-1)+str1.substring(0, str1.length()-1);
			if(str1.equalsIgnoreCase(str2)) {
				System.out.println("match");
				break;
			}
			index++;
		}
	}

}
