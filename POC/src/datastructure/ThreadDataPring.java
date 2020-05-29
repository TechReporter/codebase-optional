/**
 * 
 */
package datastructure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 212720190
 * @date Apr 6, 2019
 */
public class ThreadDataPring {
	
	ExecutorService service = Executors.newCachedThreadPool();

	public static void main(String[] args) {
		ResourceLock lock = new ResourceLock();
		 
        ThreadA a=new ThreadA(lock);
        ThreadB b=new ThreadB(lock);
        ThreadC c=new ThreadC(lock);
 
        a.start();
        b.start();
        c.start();
	}

}
