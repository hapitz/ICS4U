package com.bayviewglen.addressBookMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AddressBook {  
	Map<String, Contact> list = new HashMap<String, Contact>();	
	private PrintWriter writer;
	private Scanner scanner;
	private String name;
	private String filePath;

	public AddressBook(File file) throws FileNotFoundException{ //constructor for a new address book that takes a file as parameter
		list = new HashMap<String, Contact>();
		File f = file;
		scanner = new Scanner(f);
		filePath = "Books\\" + file.getName();
		name = file.getName().substring(0, file.getName().length()-4); 
		insertContacts();

	}
	public void insertContacts(){  //reads the contacts from the text file, and breaks the words apart, then created new contacts and puts them into hash map
		int numContacts = scanner.nextInt();
		if(numContacts > 0){
			scanner.nextLine();
		}
		
		String firstName, lastName, phoneNumber, temp;
		for(int i=0; i<numContacts; i++){
			temp = scanner.nextLine();
			firstName = temp.split(" ")[0];
			lastName = temp.split(" ")[1];
			phoneNumber = temp.split(" ")[2];
			list.put(phoneNumber , new Contact(firstName, lastName, phoneNumber)); //used phone number as the key because unique to each person
		}
	}

	public void addContact(String firstName,String lastName,String phoneNumber) throws FileNotFoundException{ //adds a contact to the hashmap of contacts, then saves and writes it to the file
		list.put(phoneNumber, new Contact(firstName,lastName,phoneNumber));
		saveContacts();
	}
	public void removeContact(Contact contact) throws FileNotFoundException{ //removes a contact from the hash map, then takes it off the text file
		list.remove(contact.getPhoneNumber());
		saveContacts();
	}
	public void displayContacts(){ //goes through all the entries in the hash map, and displays their first name, last name, and phone number.
		int counter = 0;
		for(Contact contact : list.values()){
			System.out.println(counter +1 + ":");
			System.out.println("First name: " + contact.getFirstName());
			System.out.println("Last name: " + contact.getLastName());
			System.out.println("Phone number: " + contact.getPhoneNumber());
			System.out.println();
			counter ++;
		}
	}

	public ArrayList<Contact> searchList(String x){ // goes through the hash map, and each time if finds a contact matching the search query, it puts that contact into an arrayList of contacts, which it then returns.
		ArrayList<Contact> found = new ArrayList<Contact>();
		for(Contact contact : list.values()){
			if(contact.getFirstName().toLowerCase().equals(x.toLowerCase())){
				found.add(contact);
			}
			else if(contact.getLastName().toLowerCase().equals(x.toLowerCase())){	
				found.add(contact);
			}
			else if(contact.getPhoneNumber().equals(x)){	
				found.add(contact);
			}
		}
	if(found.get(0) != null){
			return found;
		}
		return null;
	}


	public void searchDisplay(String x){ //searches through the hash map of contacts, and if it finds a match to the search query, it prints out the first name, last name, and phone number of that contact.
		int countResults = 0;
		for(Contact contact : list.values()){
			if(contact.getFirstName().toLowerCase().equals(x.toLowerCase())){
				System.out.println(countResults + 1 + ":");
				System.out.print("First Name: ");
				System.out.println(contact.getFirstName());
				System.out.print("Last Name: ");
				System.out.println(contact.getLastName());
				System.out.print("Phone Number: ");
				System.out.println(contact.getPhoneNumber());
				System.out.println();
				countResults ++;

			}
			else if(contact.getLastName().toLowerCase().equals(x.toLowerCase())){
				System.out.println(countResults + 1 + ":");
				System.out.print("First Name: ");
				System.out.println(contact.getFirstName());
				System.out.print("Last Name: ");
				System.out.println(contact.getLastName());
				System.out.print("Phone Number: ");
				System.out.println(contact.getPhoneNumber());
				System.out.println();
				countResults ++;
			}
			else if(contact.getPhoneNumber().equals(x)){
				System.out.println(countResults + 1 + ":");
				System.out.print("First Name: ");
				System.out.println(contact.getFirstName());
				System.out.print("Last Name: ");
				System.out.println(contact.getLastName());
				System.out.print("Phone Number: ");
				System.out.println(contact.getPhoneNumber());
				System.out.println();
				countResults ++;
			}
		}

	}

	public Contact search(String x){ //searches all contacts in hash map, and if it finds a match to the query, it returns that contact.
		for(Contact contact : list.values()){
			if(contact.getFirstName().toLowerCase().equals(x.toLowerCase())){
				return contact;
			}
			else if(contact.getLastName().toLowerCase().equals(x.toLowerCase())){
				return contact;
			}
			else if(contact.getPhoneNumber().equals(x)){
				return contact;
			}
		}
		return null;
	}

	public void saveContacts() throws FileNotFoundException{ //saves to the text file, so that it always has most up to date contact list.
															//goes through the values from the hash map of contacts and prints them to the file.
		writer = new PrintWriter(filePath);
		writer.println(list.size());
		for(Contact contact : list.values()){
			writer.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
		}
		writer.close();
	}





}

