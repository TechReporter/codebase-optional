/**
 * 
 */
package multithreading;

/**
 * @author 212720190
 * @date Dec 5, 2019
 */
public class ExecuteThread {
	void test(int a) {
		synchronized (this) {
			for(int i=0;i<5;i++) {
            System.out.println("Current Thread " + Thread.currentThread().getName() + " var value "+i);
            }
		}
	}
}
