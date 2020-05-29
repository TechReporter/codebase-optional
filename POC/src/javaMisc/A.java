/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Nov 30, 2019
 */
public class A {
	
	{
		System.out.println("Initializer in class A");
	}
	
	static {
		System.out.println("in static A");
	}
	
	public A() {
		System.out.println("in A constructor");
	}

}
