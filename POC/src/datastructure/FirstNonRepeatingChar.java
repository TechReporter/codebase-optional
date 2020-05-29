package datastructure;

/**
 * @author 212720190
 * @date Dec 1, 2019
 */
public class FirstNonRepeatingChar {
	public static void main(String[] args) {

		String s = "Teeter";
		s = s.toLowerCase();
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==1) {
				System.out.println((char)(j+'a'));
				break;
			}
		}
	}

}
