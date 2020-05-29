/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Nov 12, 2018
 */
public class Student {
	
	private int stdId;
	private String name;
	private Long salary;
	
	
	public Student() {
		
	}
	
	class B {
		private void bb() {
			stdId = 10;
		}
	}
	
	public Student(int stdId, String name) {
		super();
		this.stdId = stdId;
		this.name = name;
	}
	
	public Student(int stdId, String name, Long salary) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.salary = salary;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", salary=" + salary + "]";
	}

}
