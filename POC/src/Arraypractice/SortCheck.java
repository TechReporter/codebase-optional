/**
 * 
 */
package Arraypractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 4, 2020
 */
public class SortCheck {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("tanmoy","mani","dankuni","barrackpore","kolkata");
		list.sort(Comparator.comparingInt(String::length));
		list.forEach(System.out::println);
		Collections.sort(list,Collections.reverseOrder());
		list.forEach(System.out::println);
		Collections.sort(list,(e1,e2)->Integer.compare(e1.length(), e2.length()));
		list.forEach(System.out::println);

		
	}

}
