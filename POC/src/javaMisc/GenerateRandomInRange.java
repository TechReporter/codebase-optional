/**
 * 
 */
package javaMisc;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 212720190
 * @date Feb 10, 2020
 */
public class GenerateRandomInRange {

	public static void main(String[] args) {
		int min = 10;
		int max = 30;
		for(int i =0;i<15;i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(min, max));
		}
	}
}
