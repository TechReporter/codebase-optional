/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class Parent {

	static {
		System.out.println("inside static Parent");
	}
	{
		System.out.println("inside block Parent");
	}
	Parent() {
		System.out.println("inside constructor Parent");
	}
	
	Parent(int a) {
		System.out.println("inside parameterized constructor Parent");
	}
}
