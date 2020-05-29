
package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ArrayWithStack<T> {
	
	List<T> list = new ArrayList<T>();
	

	private void dataPush(T val) {
		list.add(val);
	}
	
	private T dataPop() {
		if(list.isEmpty())
			throw new EmptyStackException();
		else
			return list.remove(list.size() -1);
	}
	
	private T getItem(T value) {
		try {
			while(true) {
				if(value == dataPop()) {
					return value;
				}
			}
		}
	catch (EmptyStackException e) {
		throw new EmptyStackException();
	}
}
	
	@Override
	public String toString() {
		return "ArrayWithStack [list=" + list + "]";
	}

	public static void main(String[] args) throws ParseException {
		ArrayWithStack<Object> obj = new ArrayWithStack<>();

		for(int i = 0; i<10; i++) {
			obj.dataPush(i+2);
		}
		obj.dataPop();
		obj.dataPop();
		//obj.dataPush(20);
		System.out.println(obj.getItem(7));

		System.out.println(obj);
		
		
	}

}
