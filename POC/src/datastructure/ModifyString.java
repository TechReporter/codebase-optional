package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class ModifyString {
// modify integer, if consecutive number is even insert *, if odd insert -, if opposite nothing
	//24--> 2*4, 35-->3-5
	public static void main(String[] args) throws IOException {

		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		String result="";
		while ((line = in.readLine()) != null) {
			System.out.println(line);
			result = line.substring(0,line.length()-(line.length()-1));
			char[] chr = line.toCharArray();
			for(int i=1;i<chr.length;i++) {
				if((int)chr[i]%2==0 && (int)chr[i-1]%2==0) {
					result+="*"+String.valueOf(chr[i]);
				} else if((int)chr[i]%2!=0 && (int)chr[i-1]%2!=0) {
					result+="-"+String.valueOf(chr[i]);
				} else {
					result+=String.valueOf(chr[i]);
				}
			}
			System.out.println(result);
		}	
	}

}
