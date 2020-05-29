/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Oct 24, 2018
 */
public class Employee {
	
	private String id;
	private String Name;
	private String addr;
	

	public Employee(String id, String name, String addr) {
		super();
		this.id = id;
		Name = name;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
