package com.addressbook;

public class Contacts {

	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private long zip;
	private long phonenumber;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phone) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Contacts [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber + "]";
	}

	
	
}

	
	
	

