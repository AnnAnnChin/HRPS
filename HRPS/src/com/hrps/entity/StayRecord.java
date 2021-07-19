package com.hrps.entity;

import java.util.ArrayList;
import java.util.Date;

public class StayRecord {
	private Date checkInDate;
	private Date checkOutDate;
	
	private Guest guest;
	private Room room;
	private ArrayList<RoomServiceOrder> roomServiceOrders;
	
	public StayRecord(Date checkInDate, Guest guest, Room room) {
		
		this.checkInDate = checkInDate;
		this.guest = guest;
		this.room = room;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public Guest getGuest() {
		return guest;
	}

	public Room getRoom() {
		return room;
	}

	public ArrayList getRoomServiceOrders() {
		return roomServiceOrders;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setRoomServiceOrders(ArrayList roomServiceOrders) {
		this.roomServiceOrders = roomServiceOrders;
	}
}
