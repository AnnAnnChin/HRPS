package com.hrps.entity;

public enum Gender {
	MALE("Male"), FEMALE("Female");
	private String gender;

	private Gender(String gender) {
		this.gender = gender;
	}

	public String getValue() {
		return gender;
	}
}
