/**
 * 
 */
package datastructure;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*


  1. Given a list of id and value pair, remove all duplicates and return a list with with unique ids. If multiple pairs exist with the same id, keep the one with the max value.

  You have got list of pairs as : 

 [
    101 -> 1
    202 -> 6 *
    202 -> 3
    101 -> 2
    101 -> 3 *
    303 -> 2 *
    202 -> 4
  ]


  ------

  Output :

  [

    101 -> 3
    202 -> 6
    303 -> 2

  ]

 */

public class Solution {


	static class Pair {

		int id, value;

		Pair(int id, int value) {
			this.id = id;
			this.value = value;
		}

		public int getId() {
			return id;
		}

		public int getValue() {
			return value;
		}

		@Override
		public boolean equals(Object o) {

			if(o instanceof Pair) {
				Pair pp = (Pair) o;
				return (pp.id == this.id); 
			} else {
				return false;
			}
		}

		@Override
		public String toString(){
			return id + " -> " + value; 
		}

		@Override
		public int hashCode() {	
			return id;
		}

	}

	public static void main(String[] args) throws ParseException {/*

		List<Pair> pairs = new ArrayList<>();

		pairs.add(new Pair(101, 1));
		pairs.add(new Pair(202, 6));
		pairs.add(new Pair(202, 3));
		pairs.add(new Pair(101, 2));
		pairs.add(new Pair(101, 3));
		pairs.add(new Pair(303, 2));
		pairs.add(new Pair(202, 4));


		List<Pair> actual = getNewList(pairs);
		actual.forEach(System.out::println);

	*/
		String strDate = "2019-06-13T22:00";
		DateFormat to   = new SimpleDateFormat("dd/MM/yyyy HH:00"); // wanted format
		DateFormat from = new SimpleDateFormat("yyyy-MM-dd'T'HH:00"); // current format
		System.out.println(to.format(from.parse(strDate)));
	
	
	}

	public static List<Pair> getNewList(List<Pair> list) {

		Set<Pair> setData = new HashSet<>(); 
		Collections
		.sort(list, Comparator.comparing(Pair::getValue).reversed());

		for(Pair p : list) {
			setData.add(p);
		}
		return new ArrayList<>(setData);
	}

}
