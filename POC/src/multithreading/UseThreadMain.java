/**
 * 
 */
package multithreading;

/**
 * @author 212720190
 * @date Dec 5, 2019
 */
public class UseThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecuteThread obj = new ExecuteThread();
		
		new UseThread(obj,"Thread1");
		new UseThread(obj,"Thread2");

	}

}
