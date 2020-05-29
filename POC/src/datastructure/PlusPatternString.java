package datastructure;

/**
 * @author 212720190
 * @date May 18, 2019
 */
public class PlusPatternString {

	public static void main(String[] args) {

		String str ="RATNA";
		char[][] mat = new char[str.length()][str.length()];
		for(int i=0;i<str.length();i++) {
			for(int j =0;j<str.length();j++) {
				mat[i][j] = 'X';
			}
		}
		for(int i=0; i<str.length();i++) {
			mat[i][str.length()/2] = str.charAt(i);
		}
		for(int i=0; i<str.length();i++) {
			mat[str.length()/2][i] = str.charAt(i);
		}
		  for (int i = 0; i<str.length(); i++) 
		    { 
		        for (int j = 0; j<str.length(); j++) 
		        { 
		            System.out.print(mat[i][j] + " "); 
		        } 
		        System.out.print("\n"); 
		    }  	}

}
