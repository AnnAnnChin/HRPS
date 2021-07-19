package com.hrps.entity;

public enum RoomStatus {
	VACANT("Vacant"), OCCUPIED("Occupied"), RESERVED("Reserved"), UNDER_MAINTENANCE("Under Maintenance");
	private String roomStatus;

	private RoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	
	public String getValue() {
		return roomStatus;
	}
}
