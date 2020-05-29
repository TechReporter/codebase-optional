package comparelist;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 212720190
 * @date Dec 11, 2018
 */
public class PersonMain {

	public static void main(String[] args) throws ParseException {
		List<Person> people = Arrays.asList(new Person(1, "Tanmoy", "Dankuni",26),
				new Person(1, "Tanmoy", "Kolkata",26),
				new Person(1, "Ratna", "Dankuni",26),
				new Person(4, "Ankita", "westbengal",20),
				new Person(5, "mani", "Bangalore",10));
		
		compareList(people);
	}
	
	static void compareList(List<Person> list) {
		
		list.sort(Comparator.comparing(Person::getId).reversed()
					.thenComparing(Comparator.comparing(Person::getName))
					.thenComparing(Comparator.comparing(Person::getAge)));
		
		list.forEach(System.out::println);
	}
		
       // ArrayList<Person> unique = removeDuplicates(people);

        /*for (String element : unique) {
            System.out.println(element);
        }
		*/
/*		Map<String, Person> map1 = new HashMap<String, Person>();
		Map<String, Person> map2 = new HashMap<String, Person>();
		List<Person> addressUpdate = new ArrayList<>();
		List<Person> ageUpdate = new ArrayList<>();

		people.stream().forEach(e -> map1.put(e.getName(), e));
		people1.stream().forEach(e -> map2.put(e.getName(), e));

	
		map1.forEach((K,V) -> {
			Person mapValue2 = map2.get(K);
			
			if(!V.getAddress().equals(mapValue2.getAddress())) {
				addressUpdate.add(V);
			}
			if(V.getAge() != mapValue2.getAge()) {
				ageUpdate.add(V);
			}
		});
		
		addressUpdate.stream().forEach(System.out::println);
			System.out.println("=============");
		ageUpdate.stream().forEach(System.out::println);*/

	
	/* static ArrayList<Person> removeDuplicates(List<Person> list) {

	        // Store unique items in result.
	        ArrayList<Person> result = new ArrayList<>();

	        // Record encountered Strings in HashSet.
	        HashSet<String> set = new HashSet<>();

	        // Loop over argument list.
	        
	        list.stream().map(Person::getName).forEach(e -> {
	            if (!set.contains(e)) {
	               // result.add(e);
	                set.add(e);
	            }
	        });
	  
	        return result;
	    }*/
	

}
