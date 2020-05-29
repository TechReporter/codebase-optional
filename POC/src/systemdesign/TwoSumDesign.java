package systemdesign;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class TwoSumDesign {

	Set<Integer> data;
	public TwoSumDesign() {
		data = new HashSet<>();
	}
	
	public void add(int val) {
		if(!data.contains(val)) {
			data.add(val);
		}
	}
	
	public boolean find(int val) {
		for(Integer s : data) {
			int ss = val-s;
			if(data.contains(ss))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//Design and implement a TwoSum class. 
		//It should support the following operations: add and find.
		TwoSumDesign obj = new TwoSumDesign();
		obj.add(1);
		obj.add(3);
		obj.add(5);
		System.out.println(obj.find(7));
	}

}
