package com.cg.model;

public class Book {
	
	
	private long bookId;
	
	private String bookTiltle;
	
	private String authorName;
	
	private double bookPrice;
	
	private String condition;
	
	private String soldBy;
	
	private int noOfpages;
	
	private int publishedYear;

			
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookTiltle() {
		return bookTiltle;
	}
	public void setBookTiltle(String bookTiltle) {
		this.bookTiltle = bookTiltle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getSoldBy() {
		return soldBy;
	}
	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}
	public int getNoOfpages() {
		return noOfpages;
	}
	public void setNoOfpages(int noOfpages) {
		this.noOfpages = noOfpages;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
}

