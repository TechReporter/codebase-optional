/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Feb 28, 2020
 */
public class CheckIfStr1Str2Rotated {

	//check if str1 is rotated of str2
	public static void main(String[] args) {
		
		String str1="abdc";
		String str2="dcab";
		str1 = str1.concat(str1);
		if(str1.contains(str2)) {
			System.out.println("yes");
		}
	}

}
