/**
 * 
 */
package javaMisc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 212720190
 * @date Feb 9, 2020
 */
public class FinalList {

	public static void main(String[] args) {

		final List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		List<Integer> list1 = Collections.unmodifiableList(list);
		list.forEach(System.out::println);
		list1.add(20);
		//list = new ArrayList<>(); cannot rebind as list is final. but can add value.
		//as for object/collecion final reference cannot be change, but its state can be muted.
		list.forEach(System.out::println);

	}

}
