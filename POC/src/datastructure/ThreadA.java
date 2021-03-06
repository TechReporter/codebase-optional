/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Apr 6, 2019
 */
public class ThreadA extends Thread {

	ResourceLock lock;

	public ThreadA(ResourceLock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		
		try {
			synchronized (lock) {
				for(int i = 0; i < 100; i++) {
					while(lock.flag !=1) {
						lock.wait();
					}
					
					System.out.println(Thread.currentThread().getName()+" "+lock.val++);
					Thread.sleep(1000);
					lock.flag = 2;
					lock.notifyAll();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
