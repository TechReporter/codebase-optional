
package datastructure;

public class CheckNumberPalindrom {

	public static void main(String[] args) {

		int ori_number = 1215121;
		int number = ori_number;
		int remainder=0;
		int reverseNum = 0;
		while(number !=0) {
			remainder = number % 10;
			reverseNum = reverseNum *10 + remainder;
			number = number/10;
		}
		if(ori_number == reverseNum)
			System.out.println("palindrom");
		else {
			System.out.println("not palindrom");
		}
	}

}
