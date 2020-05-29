/**
 * 
 */
package excelUtil;

import java.util.List;

/**
 * @author 212720190
 * @date Mar 31, 2019
 */
public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private List<AdressDetails>address;
	
	public Employee(int empId, String empName, String empDesignation, List<AdressDetails> address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.address = address;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public List<AdressDetails> getAddress() {
		return address;
	}

	public void setAddress(List<AdressDetails> address) {
		this.address = address;
	}
	
}
