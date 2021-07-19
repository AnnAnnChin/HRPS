package com.hrps.entity;

public enum RoomType {
	SINGLE("Single",0,0), DOUBLE("Double",0,0), DELUXE("Deluxe",0,0), VIP("VIP",0,0);
	
	private String roomType;
	private double weekdayRate, weekendRate;
	
	private RoomType(String roomType, double weekdayRate, double weekendRate) {
		this.roomType = roomType;
		this.weekdayRate = weekdayRate;
		this.weekendRate = weekendRate;
	}
	
	public String getValue() {
		return roomType;
	}

	public double getWeekdayRate() {
		return weekdayRate;
	}

	public double getWeekendRate() {
		return weekendRate;
	}

	public void setWeekdayRate(double weekdayRate) {
		this.weekdayRate = weekdayRate;
	}

	public void setWeekendRate(double weekendRate) {
		this.weekendRate = weekendRate;
	}
}
