package com.model;

import java.util.logging.Logger;

public class BookOrder {
	private static final Logger LOGGER = Logger.getLogger(BookOrder.class.getName());
	
	private int salesid;
	private int bookid;
	private int userid;
	private int quantity;
	private float totalamount;
	private String orderdate;
	private String status;
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
public String toString(){
	return salesid+" "+bookid+" "+userid+" "+quantity+" "+totalamount+" "+orderdate+" "+status;
	}

}
	

