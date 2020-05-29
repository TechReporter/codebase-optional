/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class CountAnagramOccurrence {


	public static void main(String[] args) {
		String s = "aaba";
		String str = "aabaabaa";
		int i=0,j=s.length();
		int count=0;
		while(j<=str.length()) {
			int count_arr[] = new int[256]; 
			for(int k=0;k<str.substring(i, j).toCharArray().length;k++) {
				count_arr[str.substring(i, j).toCharArray()[k]-'a']++;
				count_arr[s.toCharArray()[k]-'a']--;
			}
			if (str.substring(i, j).toCharArray().length ==s.toCharArray().length) {
				int temp=0;
				for (int m = 0; m < 256; m++) {
			        if(count_arr[m]==0) {
			        	temp++;
			        }
				}
				if(temp==256)
					count++;
			}
				j++;
				i++;
		}
		System.out.println(count);

	}

}
