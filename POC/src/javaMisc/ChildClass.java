/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Dec 5, 2019
 */
public class ChildClass extends ParentClass {
	
	public void ma() {
		System.out.println("test child");
	}	
	
	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		obj.ma();
	}
	
}
