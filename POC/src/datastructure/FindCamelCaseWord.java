package datastructure;

import java.util.Arrays;

/**
 * @author Tanmoy Dasgupta
 * @date May 13, 2019
 */
public class FindCamelCaseWord {

	public static void main(String[] args) {

		String str = "saveChangesInTheEditor";
		String[] stringList = new String[10];
		int pointer = 0;
		int k=0;
		for(int i=0;i<str.length();i++) {
			
			if(i+1==str.length()) {
				stringList[k] = str.substring(pointer,i+1);
				break;
			}
			
			if(Character.isUpperCase(str.charAt(i))) {
				String str1 = str.substring(pointer, i);
				stringList[k] = str1;
				pointer = i;
				k++;
			}
		}
		System.out.println(Arrays.toString(stringList));
	}

}
