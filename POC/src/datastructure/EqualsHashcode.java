/**
 * 
 */
package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date May 31, 2019
 */
public class EqualsHashcode {

	private String name;
	private String address;
	
	public EqualsHashcode(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashcode other = (EqualsHashcode) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {

		EqualsHashcode a1 = new EqualsHashcode("tanmoy", "dankuni");
		EqualsHashcode a2 = new EqualsHashcode("tanmoy", "dankuni");
		EqualsHashcode a3=a2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(a3.equals(a1));


		Map<EqualsHashcode, Integer> map = new HashMap<>();
		map.put(a1, 100);
		map.put(a2, 200);
		
		System.out.println(map.get(a1)+(map.get(a2)));

	}

}
