/**
 * 
 */
package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Nov 17, 2019
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("hello world");
		list.add("hello hello world mamoon");
		list.add("new world hello");

		Map<String, Long> map = list.stream()
				 .collect(Collectors.groupingBy(Function.identity(),  
						 Collectors.reducing(0L, e -> 1L, Long::sum)));
		System.out.println(map);
		 
	}

}
