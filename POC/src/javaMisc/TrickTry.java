package javaMisc;

/**
 * @author 212720190
 * @date Nov 30, 2019
 */
public class TrickTry {

	public static void main(String[] args) {
state(null);
state(2);

	}
	
	public static void state(Object s) {
		System.out.println(" check Object state "+s);
	}
	public static void state(int s) {
		System.out.println(" check int state "+s);
	}	
	public static void state(Integer s) {
		System.out.println(" check integer state "+s);
	}

}
