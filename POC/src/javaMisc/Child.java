/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class Child extends Parent {

	static {
		System.out.println("inside static Child");
	}
	{
		System.out.println("inside block Child");
	}
	Child() {
		System.out.println("inside constructor Child");
	}

	Child(int a) {
		System.out.println("inside parameterized constructor Child");
	}

	public static void main(String[] args) {

		Child obj = new Child(10);
		System.out.println(obj);
	}

}




