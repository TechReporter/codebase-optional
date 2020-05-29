/**
 * 
 */
package com;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @author 212720190
 * @date Oct 3, 2018
 */
public class LambdaNullcheckJava8way {

		public String val;
		
	public LambdaNullcheckJava8way(String val) {
			super();
			this.val = val;
		}

	public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

	@Override
		public String toString() {
			return "LambdaNullcheckJava8way [val=" + val + "]";
		}

	public static void main(String[] args) {

		List<LambdaNullcheckJava8way> list =  Arrays.asList(new LambdaNullcheckJava8way("one"),
					new LambdaNullcheckJava8way("two"),
					null,
					new LambdaNullcheckJava8way("three"),
					new LambdaNullcheckJava8way("tanmoy"));
		
		list.sort(customNullFirst(comparing(LambdaNullcheckJava8way::getVal)));
		list.forEach(System.out::println);
	}

	public static <T> Comparator<T> customNullFirst(Comparator<T> comp) {
		
		return (a,b) -> {
			if(a == null) {
				return (b == null) ? 0:1;
			}
			if(b == null)
				return -1;
			
			return comp.compare(a, b);
		};
	}
}
