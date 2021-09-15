package edu.weber.model;

import java.io.Serializable;
import java.util.Set;


public class Contact implements Serializable{

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String addressType1;
	private String addressType2;
	private String addressA1;
	private String addressA2;
	private String addressB1;
	private String addressB2;
	private String zip1;
	private String zip2;
	private String city1;
	private String city2;
	
	public Contact() {
		this(null, null);
	}

	public Contact(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddressType1() {
		return addressType1;
	}

	public void setAddressType1(String addressType1) {
		this.addressType1 = addressType1;
	}

	public String getAddressType2() {
		return addressType2;
	}

	public void setAddressType2(String addressType2) {
		this.addressType2 = addressType2;
	}

	public String getAddressA1() {
		return addressA1;
	}

	public void setAddressA1(String addressa1) {
		this.addressA1 = addressa1;
	}

	public String getAddressA2() {
		return addressA2;
	}

	public void setAddressA2(String addressa2) {
		this.addressA2 = addressa2;
	}
	
	public String getAddressB1() {
		return addressA1;
	}

	public void setAddressB1(String addressb1) {
		this.addressB1 = addressb1;
	}

	public String getAddressB2() {
		return addressB2;
	}

	public void setAddressB2(String addressb2) {
		this.addressB2 = addressb2;
	}

	public String getZip1() {
		return zip1;
	}

	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}

	public String getZip2() {
		return zip2;
	}

	public void setZip2(String zip2) {
		this.zip2 = zip2;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}
	
	
	
}
