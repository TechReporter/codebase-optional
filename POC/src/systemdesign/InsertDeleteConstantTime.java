/**
 * 
 */
package systemdesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 212720190
 * @date Feb 12, 2020
 */
//design a data structure that support insert, delete get random, search in constant time.
// I will use hashmap, and array, hashmap for O(1) lookup. 
//for get random use a resizable array ,i.e vector or arraylist.
public class InsertDeleteConstantTime {
	List<Integer> list;
	Map<Integer, Integer> map;
	int count;

	public InsertDeleteConstantTime() {
		this.list = new ArrayList<>();
		this.map = new HashMap<Integer, Integer>();
	}

	void insert(int val) {
		if(map.containsKey(val)) {
			return;
		}
		
		list.add(val);
		map.put(val,list.size());
	}

	void delete(int val) {
		if(!map.containsKey(val)) {
			return;

		}
		int index = map.get(val);
		map.remove(val);
		int arrSize = list.size();
		int last = list.get(arrSize-1);
		Collections.swap(list, index, arrSize-1);
		list.remove(index-1);
		map.put(last, index);
	}
	
	int search(int val) {
		return map.get(val);
	}
	
	int getRandom() {
		return list.get(ThreadLocalRandom.current().nextInt(list.size()));
	}


	public static void main(String[] args) {
		InsertDeleteConstantTime obj = new InsertDeleteConstantTime();
		obj.insert(10);
		obj.insert(15);
		obj.insert(18);
		obj.insert(20);
		obj.delete(15);
		System.out.println(obj.getRandom());
	}

}
