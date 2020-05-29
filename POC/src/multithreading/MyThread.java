/**
 * 
 */
package multithreading;

/**
 * @author 212720190
 * @date Dec 4, 2019
 */
//by implement runnable
public class MyThread implements Runnable {
	int a = 5;

	@Override
	public void run() {
			test();
	}
	private void test() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
            System.out.println("Current Thread " + Thread.currentThread().getName() + " var value "+a++);
            }
		}
	}

}
