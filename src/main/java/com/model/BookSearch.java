package com.model;

import java.util.logging.Logger;

public class BookSearch {
	private static final Logger LOGGER = Logger.getLogger(BookSearch.class.getName());
	 private int isbn;
	private String title;
	private String author;
	private String publishdate;
	private String content;
	private String status;
	private float  price;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
public String toString()
{
	return +isbn+" "+title+" "+author+" "+publishdate+" "+content+" "+status+" "+price ;
}

}
