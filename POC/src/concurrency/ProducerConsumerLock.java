/**
 * 
 */
package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * @author 212720190
 * @date Apr 7, 2019
 */
public class ProducerConsumerLock {


	public static void main(String[] args) throws InterruptedException {

		List<Integer> buffer = new ArrayList<>();
		Lock lock = new ReentrantLock();
		Condition isEmpty = lock.newCondition();
		Condition isFull = lock.newCondition();
	
		class Consumer implements Callable<String> {

			@Override
			public String call() throws Exception {
				int count = 0;
				while(count++ < 50) {
					try {
						lock.lock();
						while(buffer.isEmpty()) {  
							
							//if(!isEmpty.await(5000, TimeUnit.MILLISECONDS)) { // throw excption 
							//	throw new TimeoutException("Consumer timeout");
							//}
							
							isEmpty.await();
							
						}
						buffer.remove(buffer.size()-1);
							isFull.signalAll();
					} finally {
						lock.unlock();
					}
				}
				return "Consumed : "+(count-1);
			}
			
		}
		
		
		class Producer implements Callable<String> {

			@Override
			public String call() throws Exception {
				int count = 0;
				while(count++ < 50) {
					try {
						lock.lock();
						while(isFull(buffer)) {
							isFull.await();
						}
						buffer.add(1);
						isEmpty.signalAll();
							
					} finally {
						lock.unlock();
					}
				}
				return "Produced : "+(count-1);
			}
			
		}
		List<Producer> producers = new ArrayList<>();
		for(int i = 0; i<4; i++) {
			producers.add(new Producer());
		}
		
		List<Consumer> consumers = new ArrayList<>();
		for(int i = 0; i<4; i++) {
			consumers.add(new Consumer());
		}
		
		List<Callable<String>> producerConsumerCall = new ArrayList<>();
		producerConsumerCall.addAll(producers);
		producerConsumerCall.addAll(consumers);

		ExecutorService executor = Executors.newFixedThreadPool(8);
		
		try {
			List<Future<String>> futures = executor.invokeAll(producerConsumerCall);
			
			futures.forEach(future -> {
				try {
					System.out.println(future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			});
		} finally {
			executor.shutdown();
		}
	}
	
	public static boolean isEmpty(List<Integer> buffer) {
		return buffer.size() == 0;
	}

	public static boolean isFull(List<Integer> buffer) {
		return buffer.size() == 10;
	}
	
}
