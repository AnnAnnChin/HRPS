package com.hrps.entity;

import java.util.Date;

public class Reservation {
	public static enum ReservationStatus{CONFIRMED, WAITLIST, CHECKEDIN, EXPIRED};
	
	private Guest guest;
	private Room room;
	private String reservationNo;
	private ReservationStatus status;

	private Date checkIn, checkOut;
	private int adultNo, childrenNo;

	public Reservation(Guest guest, Room room, String reservationNo,
			ReservationStatus status, Date checkIn, Date checkOut, int adultNo,
			int childrenNo) {

		this.guest = guest;
		this.room = room;
		this.reservationNo = reservationNo;
		this.status = status;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.adultNo = adultNo;
		this.childrenNo = childrenNo;
	}

	public Guest getGust() {
		return guest;
	}

	public Room getRoom() {
		return room;
	}

	public String getReservationNo() {
		return reservationNo;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public int getAdultNo() {
		return adultNo;
	}

	public int getChildrenNo() {
		return childrenNo;
	}

	public void setGust(Guest gust) {
		this.guest = gust;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public void setAdultNo(int adultNo) {
		this.adultNo = adultNo;
	}

	public void setChildrenNo(int childrenNo) {
		this.childrenNo = childrenNo;
	}
}
