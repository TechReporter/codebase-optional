/**
 * 
 */
package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 212720190
 * @date Apr 8, 2019
 */
public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException {
		// will take time to execute, as all task are executed by single thread.
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Runnable task = () -> {
			System.out.println(Thread.currentThread().getName()+" asynchrounous run async call!!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		for(int i=0;i<=9;i++) {
			CompletableFuture.runAsync(task,executor);
		}
		executor.shutdown();
	}

}
