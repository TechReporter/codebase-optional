/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Nov 30, 2019
 */
public class C extends B {
	{
		System.out.println("Initializer in class c");
	}
	
	static {
		System.out.println("in static c");
	}
	public C() {
		System.out.println("in c constructor");
	}
	
	public static void main(String... args) {
		new C();
	}
}
