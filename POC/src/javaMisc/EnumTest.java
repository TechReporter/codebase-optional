/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Feb 10, 2020
 */
public class EnumTest {

	public static void main(String[] args) {
		for(EnumCheck e : EnumCheck.values()) {
				System.out.println(e.getVal());
		}
		
	}

}
