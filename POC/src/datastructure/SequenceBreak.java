/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jul 6, 2019
 */
//count min 1 req to break 010 seq.

public class SequenceBreak {

	public static void main(String[] args) {
		String str = "0100101010";
		int fromIndex = 0;
		int count = 0;
		char[] chr = str.toCharArray();
		while((fromIndex = str.indexOf("010", fromIndex))!= -1) {
			System.out.println("fromIndex :"+fromIndex);

			if(String.valueOf(chr[fromIndex]).concat(String.valueOf(chr[fromIndex+1]))
					.concat(String.valueOf(chr[fromIndex+2])).equals("010")) {
				chr[fromIndex+2]='1';
				count++;
			}
			fromIndex++;

		}
		//another apporach
		int c = (str.length()-str.replaceAll("010", "").length())/3;

		System.out.println(c);

		System.out.println(count);
	}

}
