/**
 * 
 */
package hackerrank;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author 212720190
 * @date Mar 17, 2020
 */
public class SplitIterator {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(-8);
		list.add(10);
		list.add(-20);
		list.add(null);
	Comparator<Integer> r = Collections.reverseOrder();
	Collections.sort(list, r);
	for(int i : list)
	System.out.print(i+ " ");
	System.out.println();
		
		
		/*
		
		List<String> Languages = Arrays.asList("Python","Java","python");
	      Map<String, Integer> LanguagesLength = 
	      Languages.stream().collect(Collectors.toMap(Function.identity(), String::length));

	      System.out.println("list: " + Languages);
		
		

		ArrayList<Double> vals = new ArrayList<>();
		vals.add(1.0);vals.add(4.0);vals.add(16.0);
		Spliterator<Double> splitr = vals.spliterator();
		while(splitr.tryAdvance((n)-> System.out.println(" "+n)));
		System.out.println();
		splitr = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while(splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		splitr = sqrs.spliterator();
		splitr.forEachRemaining((n) -> System.out.print(" "+n));
	*/}

}
