package leetcode;

/**
 * @author 212720190
 * @date Apr 9, 2020
 */
public class FindWordsToFormString {

	//1160. Find Words That Can Be Formed by Characters
	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"}; 
		String chars = "atach";

		int[] arr1=new int[26];
		for(int i=0;i<chars.length();i++)
			arr1[chars.charAt(i)-'a']++;

		int count=0;
		for(String s : words) {
			int[] aa = arr1.clone();
			boolean flag=true;
			for(char c : s.toCharArray()) {
				aa[c-'a']--;
				if(aa[c-'a']<0) {
					flag=false;
					break;
				}
			}
			if(flag)
				count+=s.length();
		}
		System.out.println(count);
	}



}
