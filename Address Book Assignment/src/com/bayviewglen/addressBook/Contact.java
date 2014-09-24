package com.bayviewglen.addressBook;

public class Contact {
	
	private String lname;
	private String fname;
	private String phone;
	
	public Contact(String lastName,String firstName,String phoneNumber){
		lastName = lname;
		firstName = fname;
		phoneNumber = phone;
	}
	
	public String getFirstName(){
		return fname;
	}
	public void setFirstName(String x){
		fname = x;
	}
	public String getLastName(){
		return lname;
	}
	public void setLastName(String x){
		lname = x;
	}
	public String getPhoneNumber(){
		return phone;
	}
	public void setPhoneNumber(String x){
		phone = x;
	}
	
	
	
	
	


}
