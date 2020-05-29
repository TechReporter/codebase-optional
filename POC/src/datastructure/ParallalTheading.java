/**
 * 
 */
package datastructure;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 212720190
 * @date Feb 17, 2019
 */
public class ParallalTheading {

	public static void main(String[] args) {


		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		//synchronized (this) {
			Runnable task = () -> {
				System.out.println(Thread.currentThread().getName());
				System.out.println("0");
			};

		//}
		//synchronized(this) {
			Runnable task1 = () -> {
				System.out.println(Thread.currentThread().getName());
				System.out.println("1");
			};
				
			executor.scheduleWithFixedDelay(task,0, 1, TimeUnit.SECONDS);
			executor.scheduleWithFixedDelay(task1,0, 1, TimeUnit.SECONDS);
	}

/*	@Override
	public void run() {


		//}
	
		
	}*/

}
