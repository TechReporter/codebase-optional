/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 12, 2019
 */
public class CharacterFrequency {

	public static void main(String[] args) {

		String str = "tanmoydasgupta";
		String result ="";
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		for(int j=0;j<str.length();j++) {
			if(arr[str.charAt(j) - 'a'] != 0) {
				result=result.concat(String.valueOf(str.charAt(j)))
						.concat(String.valueOf(arr[str.charAt(j)-'a']))
						.concat(" ");
	            arr[str.charAt(j) - 'a'] = 0; 
			}
	
		}
		System.out.println(result);
	}

}
