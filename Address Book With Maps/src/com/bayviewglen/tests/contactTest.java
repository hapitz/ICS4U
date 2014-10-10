package com.bayviewglen.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bayviewglen.addressBookMaps.Contact;

public class contactTest {

	@Test
	public void getFirstNameTest() {
		Contact tempContact = new Contact("John", "Smith", "416-225-2855");
		assertEquals("Contact that should return the first name of the contact", "John", tempContact.getFirstName());
	}
	@Test
	public void getLastNameTest() {
		Contact tempContact = new Contact("John", "Smith", "416-225-2855");
		assertEquals("Contact that should return the last name of the contact", "Smith", tempContact.getLastName());
	}
	@Test
	public void getPhoneNumberTest() {
		Contact tempContact = new Contact("John", "Smith", "416-225-2855");
		assertEquals("Contact that should return the phone # of the contact", "416-225-2855", tempContact.getPhoneNumber());
	}
	@Test
	public void setFirstNameTest() {
		Contact tempContact = new Contact("John", "Smith", "416-225-2855");
		tempContact.setFirstName("Mike");
		assertEquals("Contact should return the first name given.", "Mike", tempContact.getFirstName());
	}
	@Test
	public void setLastNameTest() {
		Contact tempContact = new Contact("John", "Smith", "416-225-2855");
		tempContact.setLastName("Thomas");
		assertEquals("Contact should return the last name given.", "Thomas", tempContact.getLastName());
	}
	@Test
	public void setPhoneNumberTest() {
		Contact tempContact = new Contact("John", "Smith", "416-225-2855");
		tempContact.setPhoneNumber("416-222-2222");
		assertEquals("Contact should return with the phone number given.", "416-222-2222", tempContact.getPhoneNumber());
	}
	

}
