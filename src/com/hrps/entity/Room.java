package com.hrps.entity;

public class Room {
	private RoomType roomType;
	private double rate;
	private String roomNo;
	private BedType bedType;
	private boolean wifiEnabled;
	private boolean smokingAllowed;
	private RoomStatus roomStatus;
	
	public Room(RoomType roomType, double rate, String roomNo, BedType bedType,
			boolean wifiEnabled, boolean smokingAllowed, RoomStatus roomStatus) {
		
		this.roomType = roomType;
		this.rate = rate;
		this.roomNo = roomNo;
		this.bedType = bedType;
		this.wifiEnabled = wifiEnabled;
		this.smokingAllowed = smokingAllowed;
		this.roomStatus = roomStatus;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public double getRate() {
		return rate;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public BedType getBedType() {
		return bedType;
	}

	public boolean isWifiEnabled() {
		return wifiEnabled;
	}

	public boolean isSmokingAllowed() {
		return smokingAllowed;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public void setBedType(BedType bedType) {
		this.bedType = bedType;
	}

	public void setWifiEnabled(boolean wifiEnabled) {
		this.wifiEnabled = wifiEnabled;
	}

	public void setSmokingAllowed(boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}
}
