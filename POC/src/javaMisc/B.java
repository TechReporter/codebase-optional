/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Nov 30, 2019
 */
public class B extends A {
	{
		System.out.println("Initializer in class B");
	}
	
	static {
		System.out.println("in static B");
	}
	public B() {
		System.out.println("in B constructor");
	}
}
