package treedatastructure;


public class ReplaceAllVowel {

	//replace all vowel from a string
	public static void main(String[] args) {
		String input = "abcdefg";
		char[] chr = input.toCharArray();
		char last_visit_con = ' ';
		for(int i=input.length()-1;i>=0;i--) {
			if((int)chr[i]==97 || (int)chr[i]==101 || (int)chr[i]==105 || (int)chr[i]==111 || (int)chr[i]==117) {
				input = input.replace(chr[i],last_visit_con);
			} else {
				last_visit_con = chr[i];
			}
		}
		System.out.println(input);

	}

}
