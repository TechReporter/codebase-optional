/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class Derived extends Base {

	public Derived(int x) {
		super(x);
	}

	public Derived() {
		super(100);
	}
	
	public static void main(String[] args) {

		Base obj = new Base(10);
		Derived obj1 = new Derived();
		System.out.println(obj.x);
		System.out.println(obj1.x);
	}
}
