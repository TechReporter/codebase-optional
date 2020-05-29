/**
 * 
 */
package datastructure;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author 212720190
 * @date Feb 5, 2019
 */
public class ThreadExecutor implements Runnable {

	public static void main(String[] args) throws InterruptedException {

		ThreadExecutor obj = new ThreadExecutor();
		obj.run();
		}

	@Override
	public void run() {
		
		try {
			Runnable task1 = () -> {
				String threadName = Thread.currentThread().getName();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    System.out.println("Hello " + threadName);
			};

			System.out.println("Done!");
			
			ExecutorService executor = Executors.newFixedThreadPool(2);
			executor.submit(() -> {
				String threadName = Thread.currentThread().getName();
				System.out.println("first :: "+threadName);
			});
			
			Future<?> future2 = executor.submit(task1);
			System.out.println(future2.get());
			Callable<String> task = () -> {
				String threadName = Thread.currentThread().getName();
				System.out.println("second :: "+threadName);
				Thread.sleep(10000);
				return "tanmoy dasgupta";
			
			};
			
			Future<String> future1 = executor.submit(task);
				System.out.println(future1.get());
		}  catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	
			
			ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
			Runnable scheduleTask =() -> System.out.println(System.nanoTime());
				ScheduledFuture<?> scheduleFuture = 
						executorService.scheduleAtFixedRate(scheduleTask, 2, 2, TimeUnit.SECONDS);
				try {
					TimeUnit.MILLISECONDS.sleep(1337);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				long remainingDelay = scheduleFuture.getDelay(TimeUnit.MILLISECONDS);
				System.out.printf("Remaining Delay: %sms", remainingDelay);
		
				ScheduledExecutorService executorDelay = Executors.newScheduledThreadPool(1);

				Runnable taskDelay = () -> {
				    try {
				        TimeUnit.SECONDS.sleep(2);
				        System.out.println("Scheduling: " + System.nanoTime());
				    }
				    catch (InterruptedException e) {
				        System.err.println("task interrupted");
				    }
				};

				executorDelay.scheduleWithFixedDelay(taskDelay, 0, 1, TimeUnit.SECONDS);
			
	}

}
