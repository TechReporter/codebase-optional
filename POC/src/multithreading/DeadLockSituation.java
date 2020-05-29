/**
 * 
 */
package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 212720190
 * @date Jan 29, 2020
 */
public class DeadLockSituation {

String s = "mani";
String s1 = "dasgupta";

private Lock lock1 = new ReentrantLock();
private Lock lock2 = new ReentrantLock();


Thread t1 = new Thread() {
	public void run() {
		lock1.lock();
		System.out.println(Thread.currentThread().getName()+"print 11");
		
		lock2.lock();
		System.out.println(Thread.currentThread().getName()+"printt 222");
		lock1.unlock();
		lock2.unlock();
/*		while(true) {
			synchronized (s) {
				try {
					System.out.println("thread name"+Thread.currentThread().getName()+" t1 "+s);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (s1) {
					System.out.println("thread name"+Thread.currentThread().getName()+" t1 "+s1);
				}
			}
		}*/
	}
};

Thread t2 = new Thread() {
	public void run() {
		
		lock2.lock();
		System.out.println(Thread.currentThread().getName()+"print 3333");
		lock1.lock();
		System.out.println(Thread.currentThread().getName()+"printt 444");
		lock2.unlock();
		lock1.unlock();
		/*
		while(true) {
			synchronized (s1) {
				System.out.println("thread name"+Thread.currentThread().getName()+" t2 "+s1);
				synchronized (s) {
					System.out.println("thread name"+Thread.currentThread().getName()+" t2 "+s);
				}
			}
		}
	*/}
};
	
	public static void main(String[] args) {

		DeadLockSituation obj = new DeadLockSituation();
		obj.t1.start();
		obj.t2.start();

	}

}
