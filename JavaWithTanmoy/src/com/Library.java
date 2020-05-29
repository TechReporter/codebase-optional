/**
 * 
 */
package com;

import java.util.List;

/**
 * @author 212720190
 * @date Nov 30, 2018
 */
public class Library {
	private int libId;
	private String deptName;
	private List<Book> listOfBook;
	
	public Library(int libId, String deptName, List<Book> listOfBook) {
		super();
		this.libId = libId;
		this.deptName = deptName;
		this.listOfBook = listOfBook;
	}
	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Book> getListOfBook() {
		return listOfBook;
	}
	public void setListOfBook(List<Book> listOfBook) {
		this.listOfBook = listOfBook;
	}
}
