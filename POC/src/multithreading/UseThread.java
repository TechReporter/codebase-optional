/**
 * 
 */
package multithreading;

/**
 * @author 212720190
 * @date Dec 5, 2019
 */
public class UseThread extends Thread {
	ExecuteThread tt;
	int a = 5;
	String name;
	
	public UseThread(ExecuteThread tt, String name) {
		this.tt = tt;
		this.name = name;
		start();
	}

	@Override
	public void run() {
		tt.test(a);
	}

}
