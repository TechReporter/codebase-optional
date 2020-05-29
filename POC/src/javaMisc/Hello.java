/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class Hello<T> {
private T t;

	public Hello(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return t.toString();
	}
	
	public static void main(String[] args) {

		System.out.println(new Hello<String>("tanmoy"));
		System.out.println(new Hello("dasgupta"));

	}

}
