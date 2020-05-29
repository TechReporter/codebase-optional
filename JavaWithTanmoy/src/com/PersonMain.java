/**
 * 
 */
package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author 212720190
 * @date Nov 24, 2018
 */
public class PersonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Person> pList = Arrays.asList(new Person(100, "Tanmoy", 26, "electronics"),
				new Person(200, "swarup", 35, "mechanical"),
				new Person(300, "mani", 22, "computer"),
				new Person(400, "sanjoy", 21, "electronics"),
				new Person(500, "ankita", 25, "electrical"),
				new Person(600, "sathi", 28, "chemistry"));
		
		/*Map<Person, Set<String>> lastNamesByCity= pList.stream()
				.collect(Collectors.groupingBy(e -> e.getAge()),
						mapping(Person::getLastName));*/
		
		System.out.println(pList.stream().map(Person::getAge).reduce(0, Integer::max));
		
	}

}
