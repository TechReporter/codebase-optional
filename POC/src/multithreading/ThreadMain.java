package multithreading;

/**
 * @author 212720190
 * @date Dec 4, 2019
 */
public class ThreadMain {

	public static void main(String[] args) {
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();
		Thread t = new Thread(obj1);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t.setName("thread1");
		t1.setName("thread2");
		t.start();
		t1.start();
		t2.setName("thread3");
		t2.start();

	}

}
