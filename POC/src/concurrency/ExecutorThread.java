/**
 * 
 */
package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 212720190
 * @date Apr 7, 2019
 */
public class ExecutorThread {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<?> callTask = () -> {
			Thread.sleep(2000);
		
			return Thread.currentThread().getName()+" Calculate "+10*2;
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		int i =0;
		while(i<10) {
			
			Future<?> future = executor.submit(callTask);
			//executor.notify();
			System.out.println(Thread.currentThread().getName()+future.get());
			i++;
		}
		executor.shutdown();

	}

}
