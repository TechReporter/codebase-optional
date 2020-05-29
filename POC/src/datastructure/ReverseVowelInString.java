package datastructure;

/**
 * @author 212720190
 * @date Jan 3, 2020
 */
public class ReverseVowelInString {

	public static void main(String[] args) {

		String str = "cbeAjOdi";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		if(str==null) {
			return null;
		}
		int p1 = 0;
		int p2 = str.length()-1;
		char[] chr = str.toCharArray();

		while(p1<p2) {
			if((chr[p1]=='a' || chr[p1]=='e' || chr[p1]=='i' ||
					chr[p1]=='o' || chr[p1]=='u' || chr[p1]=='A' || chr[p1]=='E' || chr[p1]=='I' ||
					chr[p1]=='O' || chr[p1]=='U')
					&& (chr[p2]=='a' || chr[p2]=='e' || chr[p2]=='i' ||
					chr[p2]=='o' || chr[p2]=='u' || chr[p2]=='A' || chr[p2]=='E' || chr[p2]=='I' ||
					chr[p2]=='O' || chr[p2]=='U')) {
				char temp = chr[p1];
				chr[p1] = chr[p2];
				chr[p2] = temp;
				p1++;
				p2--;
			}
			else if(chr[p1]=='a' || chr[p1]=='e' || chr[p1]=='i' ||
					chr[p1]=='o' || chr[p1]=='u' || chr[p1]=='A' || chr[p1]=='E' || chr[p1]=='I' ||
					chr[p1]=='O' || chr[p1]=='U') {
				p2--;
			} else {
				p1++;
			}
		}
		return String.valueOf(chr);
				
	}

}
