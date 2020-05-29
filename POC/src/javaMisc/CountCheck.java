/**
 * 
 */
package javaMisc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class CountCheck {

	static AtomicInteger count = new AtomicInteger(1);
	static int count1 =1;
	
	void incrCount(AtomicInteger count) {
		count.incrementAndGet();
		for(int i=0;i<3;i++) {
			count.incrementAndGet();
		}
		System.out.println(count);
	}
	
	void incrCount1(int count1) {
		count1++;
		for(int i=0;i<3;i++) {
			count1++;
		}
		System.out.println(count1);
	}
	public static void main(String[] args) {
	new CountCheck().incrCount(count);
	System.out.println(count); //5 5 print as its atomic integer so update value will 
	//be visible everywhere
	new CountCheck().incrCount1(count1); //inside its increment
	System.out.println(count1); //outside still its 1 

	}

}
