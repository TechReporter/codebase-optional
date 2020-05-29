/**
 * 
 */
package creational.singleton;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class DbSingleton {
	
	private static DbSingleton instance = null;
	
	private DbSingleton() {
		
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			instance = new DbSingleton();  // lazy loading creation
		}
		return instance;
	}

}
