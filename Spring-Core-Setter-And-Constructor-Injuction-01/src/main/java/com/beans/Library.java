package com.beans;

public class Library 
{
	private int bookId;
	private String bookName;
	private String autherName;
	private int bookqty;
	
	public Library()
	{
		super();
	}
	
	public Library(String autherName, int bookqty) {
		super();
		this.autherName = autherName;
		this.bookqty = bookqty;
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

	public void display()
	{
		System.out.println("Book Id:" +bookId);
		System.out.println("Book Name:" +bookName);
		System.out.println("Autor Name:" +autherName);
		System.out.println("Book Quentity:" +bookqty);
	}
}
