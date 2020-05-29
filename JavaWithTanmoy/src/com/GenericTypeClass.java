
package com;

import java.beans.PersistenceDelegate;
import java.util.Arrays;
import java.util.List;

public class GenericTypeClass<T> {

	T value;

	public GenericTypeClass(T value) {
		super();
		this.value = value;
	}

	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person(100, "Tanmoy", 26, "ece"),
				new Person(200, "Mani", 22, "cse"),
				new Person(300, "Sanjoy", 21, "ME"));
		GenericTypeClass<Integer> obj = new GenericTypeClass<Integer>(10);
		GenericTypeClass<List<Person>> obj1 = new GenericTypeClass<List<Person>>(list);

		System.out.println(obj.getClass().getSimpleName());
		obj1.getValue().stream().map(Person::getName).forEach(System.out::println);

	}

}
