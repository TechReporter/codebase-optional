package systemdesign;

/**
 * @author 212720190
 * @date Feb 13, 2020
 */
public class FizzBuzzPrint {

	public static void main(String[] args) {

		int size=15;
		
		for(int i=0;i<=size;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FIZZ");
			} else if(i%5==0) {
				System.out.println("BUZZ");
			} else if(i%3==0) {
				System.out.println("FIZZBUZZ");
			} else {
				System.out.println(i);
			}
				
		}
	}

}
