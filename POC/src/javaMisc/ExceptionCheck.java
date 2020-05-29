/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class ExceptionCheck {

	public static void main(String[] args) {
		try {
			System.out.println("1111");
			throw new RuntimeException();
			//System.out.println("tanmoy"); // its unrecheble code here
		} catch (Exception e) {
			System.out.println("dsdd");
		} finally {
			System.out.println("sdsdss");
		}
	}

}
