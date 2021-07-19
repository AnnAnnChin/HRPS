package com.hrps.entity;

public enum BedType {
	SINGLE("Single"), DOUBLE("Double"), MASTER("Master");
	private String bedType;
	
	private BedType(String bedType) {
		this.bedType = bedType;
	}
	
	public String getValue() {
		return bedType;
	}
}
