/**
 * 
 */
package javaMisc;

import java.util.UUID;

/**
 * @author 212720190
 * @date Nov 27, 2019
 */
public class Person {
	
	String name;
	UUID id;
	
	public Person(String name, UUID id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
