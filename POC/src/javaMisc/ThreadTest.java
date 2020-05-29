package javaMisc;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class ThreadTest implements Runnable {

	@Override
	public void run() {

		System.out.println("test");
		System.out.println("test1");
	}
	public static void main(String[] args) {

		ThreadTest obj = new ThreadTest();
		Thread t = new Thread(obj);
		t.start();
		System.out.println("test111");

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("test new");
	}
}