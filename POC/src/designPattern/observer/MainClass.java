/**
 * 
 */
package designPattern.observer;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class MainClass {
	public static void main(String... args) {
		Observable obj = new Observable();
		new Observable1(obj);
		new Observable2(obj);
		obj.sendEvent("tanmoy dasgupta");
	}

}
