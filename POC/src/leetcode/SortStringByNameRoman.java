/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

/**
 * @author 212720190
 * @date Apr 2, 2020
 */
public class SortStringByNameRoman {

	static class Name {
		private String name;
		private int decimal;
		public Name(String name, int decimal) {
			this.name = name;
			this.decimal = decimal;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDecimal() {
			return decimal;
		}
		public void setDecimal(int decimal) {
			this.decimal = decimal;
		}

	}
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Louis IX","Louis VIII");
		List<Name> list = new ArrayList<>();
		for(String name : names) {
			String[] ss = name.split(" ");
			list.add(new Name(ss[0],romanToInt(ss[1])));
		}
		

		Collections.sort(list, Comparator.comparing(Name::getName)
				.thenComparing(Name::getDecimal));
		List<String> reslt = new ArrayList<>();
		for(Name name : list) {
			reslt.add(name.getName()+" "+intToRoman(name.getDecimal()));
		}

	}

	public static int romanToInt(String s) {

		if(s==null || s.length()==0)
			return 0;

		Map<Character, Integer> map = new HashMap<>();
		map.put('M',1000);
		map.put('D',500);
		map.put('C',100);
		map.put('L',50);
		map.put('X',10);
		map.put('V',5);
		map.put('I',1);

		char[] chr = s.toCharArray();
		int result = map.get(chr[chr.length-1]);

		for(int i=chr.length-2;i>=0;i--) {
			if(map.get(chr[i])<map.get(chr[i+1])) {
				result=result-map.get(chr[i]);
			} else {
				result=result+map.get(chr[i]);
			}
		}
		return result;

	}
	
	 public static String intToRoman(int num) {
	        if(num==0)
	            return "";
	        
			int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

		String[] romanVal = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

			StringBuilder str = new StringBuilder();
			
			for(int i=0;i<number.length;i++) {
				while(num-number[i]>=0) {
					str.append(romanVal[i]);
					num -=number[i];
				}
			}
	        return str.toString();
	    }

}
