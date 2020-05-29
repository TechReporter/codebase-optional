/**
 * 
 */
package com;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Nov 21, 2018
 */
public class PredicateExmpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = Arrays.asList("tanmoy","mani","surajdfdfds",
				"sangaloreccodejamaaaa","shashanksutradhar");
		
		Predicate<String> pre =  new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return (t.startsWith("s") && t.length()>10);
			}
		}; 
		filterData(list,pre);
	}

	private static void filterData(List<String> listData, Predicate<String> preVal) {
		
		System.out.println(new Date());
		
		listData.stream().filter(preVal)
		.filter(preVal)
		.peek(PredicateExmpl::longTask)
		.parallel() // sort the stream
		.mapToInt(e->e.length())
		.forEach(System.out::println);
		}
	
    private static void longTask (String s) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
