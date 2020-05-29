/**
 * 
 */
package systemdesign;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 212720190
 * @date Jan 12, 2020
 */
public class CustomBlockingQueue<E> {
	
	int max_size;
	Queue<E> queue = new java.util.LinkedList<>();
	ReentrantLock lock = new ReentrantLock(true);
	Condition isFull = lock.newCondition();
	Condition isEmpty = lock.newCondition();

	public CustomBlockingQueue(int size) {
		this.max_size=size;
		this.queue= new java.util.LinkedList<>();
	}
	
	void put(E data) throws InterruptedException {
		lock.lock();
		try {
			if(queue.size()==max_size) {
				isEmpty.await();
			}
			queue.add(data);
			isFull.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	void delete() throws InterruptedException {
		lock.lock();
		try {
			while(queue.size()==0) {
				isFull.await();
			}
			E item = queue.remove();
			isEmpty.signalAll();
		} finally {
			lock.unlock();
		}
		
	}
	
}
