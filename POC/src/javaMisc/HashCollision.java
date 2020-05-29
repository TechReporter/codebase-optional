package javaMisc;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author 212720190
 * @date Nov 27, 2019
 */
public class HashCollision {

	public static void main(String[] args) {
		Person pp = null;
		HashMap<Person, Integer> map = new HashMap<>();
		long start1 = System.currentTimeMillis();

		for(int i=0;i<30000;i++) {
			UUID id = UUID.randomUUID();
			Person p = new Person("tanmoy", id);
			map.put(p, i);
		}
		long stop1 = System.currentTimeMillis();
		System.out.println(stop1-start1+" millis");

		long start = System.currentTimeMillis();
		System.out.println(map.get(pp));
		long stop = System.currentTimeMillis();
		System.out.println(stop-start+" millis");
	}

}
