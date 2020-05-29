/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Nov 30, 2018
 */
public class Book {
	private int bookId;
	private String bookName;
	
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	

}
