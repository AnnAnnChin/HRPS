package com.hrps.entity;

public class Guest {
	private String name;
	private String creditCardDetails;
	private String address;
	private String country;
	private Gender gender;
	private String identity;
	private String nationality;
	private int contact;

	public Guest(String name, String creditCardDetails, String address,
			String country, Gender gender, String identity, String nationality,
			int contact) {
		
		this.name = name;
		this.creditCardDetails = creditCardDetails;
		this.address = address;
		this.country = country;
		this.gender = gender;
		this.identity = identity;
		this.nationality = nationality;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public String getCreditCardDetails() {
		return creditCardDetails;
	}

	public String getAddress() {
		return address;
	}

	public String getCountry() {
		return country;
	}

	public Gender getGender() {
		return gender;
	}

	public String getIdentity() {
		return identity;
	}

	public String getNationality() {
		return nationality;
	}

	public int getContact() {
		return contact;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreditCardDetails(String creditCardDetails) {
		this.creditCardDetails = creditCardDetails;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
}
