package com.hrps.entity;

public enum RoomServiceStatus {
	CONFIRMED("Confirmed"), PREPARING("Preparing"), DELIVERED("Delivered");
	private String roomServiceStatus;

	private RoomServiceStatus(String roomServiceStatus) {
		this.roomServiceStatus = roomServiceStatus;
	}
	
	public String getValue() {
		return roomServiceStatus;
	}
}
