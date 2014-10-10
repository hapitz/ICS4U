package com.bayviewglen.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.bayviewglen.addressBookMaps.AddressBook;
import com.bayviewglen.addressBookMaps.Contact;

public class AddressBookTest {

	@Test
	public void addContactTest() throws IOException {
		File file = new File("books/addressbookTestFile.txt");
		AddressBook book = new AddressBook(file);
		book.addContact("Marcus", "Walter", "416-438-7834");
		Contact testContact = new Contact("Marcus", "Walter", "416-438-7834");
		
		assertEquals("This should return the contact I created above", testContact.getPhoneNumber(),  book.search("416-438-7834").getPhoneNumber());
		assertEquals("This should return the contact I created above", testContact.getFirstName(),  book.search("416-438-7834").getFirstName());
		assertEquals("This should return the contact I created above", testContact.getLastName(),  book.search("416-438-7834").getLastName());

		assertEquals("This should return the contact I created above", testContact.getPhoneNumber(),  book.search("Walter").getPhoneNumber());
		assertEquals("This should return the contact I created above", testContact.getFirstName(),  book.search("Walter").getFirstName());
		assertEquals("This should return the contact I created above", testContact.getLastName(),  book.search("Walter").getLastName());
		
		assertEquals("This should return the contact I created above", testContact.getPhoneNumber(),  book.search("Marcus").getPhoneNumber());
		assertEquals("This should return the contact I created above", testContact.getFirstName(),  book.search("Marcus").getFirstName());
		assertEquals("This should return the contact I created above", testContact.getLastName(),  book.search("Marcus").getLastName());
	}
	@Test
	public void removeContactTest() throws FileNotFoundException{
		File file = new File("books/addressbookTestFile.txt");
		AddressBook book = new AddressBook(file);
		book.addContact("Tom", "Rostani", "416-999-0943");
		Contact testContact = new Contact("Tom", "Rostani", "416-999-0943");
		book.removeContact(testContact);
		
		assertNull("This should return null, becasue when search doesn't find something it returns null", book.search("416-999-0943"));
		
	}
	
	@Test
	public void searchListTest() throws FileNotFoundException{
		File file = new File("books/addressbookTestFile.txt");
		AddressBook book = new AddressBook(file);
		book.addContact("Marco", "Smithers", "416-999-0945");
		book.addContact("Marco", "Johanson", "416-888-0943");
		ArrayList<Contact> testList = new ArrayList<Contact>();
		testList.add(new Contact("Marco", "Johanson", "416-888-0943"));
		testList.add(new Contact("Marco", "Smithers", "416-999-0945"));
		ArrayList<Contact> testList2 = book.searchList("Marco");
		assertEquals("Makes sure that the array returned holds the 2 'Marco' contacts.", true, testList2.size()==2);
	}

	@Test
	public void searchTest() throws FileNotFoundException{
		File file = new File("books/addressbookTestFile.txt");
		AddressBook book = new AddressBook(file);
		book.addContact("Frank", "DeLongly", "416-878-9987");
		Contact tempCont = new Contact("Frank", "DeLongly", "416-878-9987");
		Contact searchedContact = book.search("DeLongly");
		assertEquals("Makes sure that the contact found matches the contact searched for", true, tempCont.getFirstName().equals(searchedContact.getFirstName()));
		assertEquals("Makes sure that the contact found matches the contact searched for", true, tempCont.getLastName().equals(searchedContact.getLastName()));
		assertEquals("Makes sure that the contact found matches the contact searched for", true, tempCont.getPhoneNumber().equals(searchedContact.getPhoneNumber()));
		assertNull("If contact is not found, null will be returned", book.search("Random"));
		
	}
	
	
	
	
}
