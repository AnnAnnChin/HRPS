package com.hrps.entity;

import java.util.ArrayList;
import java.util.Date;

public class RoomServiceOrder {
	private Date orderDate;
	private RoomServiceStatus status;
	private String remarks;
	private ArrayList<MenuItem> itemList;
	
	public RoomServiceOrder(Date orderDate, RoomServiceStatus status,
			String remarks, ArrayList<MenuItem> itemList) {
		
		this.orderDate = orderDate;
		this.status = status;
		this.remarks = remarks;
		this.itemList = itemList;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public RoomServiceStatus getStatus() {
		return status;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public ArrayList<MenuItem> getItemList() {
		return itemList;
	}
	
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public void setStatus(RoomServiceStatus status) {
		this.status = status;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public void setItemList(ArrayList<MenuItem> itemList) {
		this.itemList = itemList;
	}
}
