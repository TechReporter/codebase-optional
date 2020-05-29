/**
 * 
 */
package creational.singleton;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class DbSingletonThreadSafe {

private static volatile DbSingletonThreadSafe instance = null; //volatile to ensure instance remain same in jvm
	
	private DbSingletonThreadSafe() {
		if(instance != null) {
			throw new RuntimeException("not null here"); // restrict use reflection to create
		}
	}
	
	public static DbSingletonThreadSafe getInstance() {
		if(instance == null) {
			synchronized (DbSingletonThreadSafe.class) {
				if(instance == null) {
					instance = new DbSingletonThreadSafe();  // double check with synchronized, thread safe
				}
			}
		}
		return instance;
	}
}
