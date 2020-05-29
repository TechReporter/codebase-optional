package creational.singleton;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class SingletonMain {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);
		DbSingleton instance1 = DbSingleton.getInstance();
		System.out.println(instance1);
	}

}
