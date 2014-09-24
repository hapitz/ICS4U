package com.bayviewglen.addressBook;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
	private ArrayList<Contact> list;

	public void addContact(String x,String y,String z){
		list.add(new Contact(x,y,z));
	}

	public void displayContacts(){
		for(Contact contact : list){
			System.out.println(contact.getFirstName());
			System.out.println(contact.getLastName());
			System.out.println(contact.getPhoneNumber());
		}
	}

	public void searchDisplay(String x){
		for(Contact contact : list){
			if(contact.getFirstName().toLowerCase().contains(x)){
				System.out.println(contact.toString());
			}
			else if(contact.getLastName().toLowerCase().contains(x)){
				System.out.println(contact.toString());
			}
			else if(contact.getPhoneNumber().contains(x)){
				System.out.println(contact.toString());
			}
			else{
				System.out.println("No contacts were found, sorry.");
			}

		}

	}
	public void searchDelete(String x){
		for(Contact contact : list){
			if(contact.getFirstName().toLowerCase().contains(x)){
				list.remove(contact);
			}
			else if(contact.getLastName().toLowerCase().contains(x)){
				list.remove(contact);
			}
			else if(contact.getPhoneNumber().toLowerCase().contains(x)){
				list.remove(contact);
			}
			else{
				System.out.println("Sorry, that contact was not found");
			}
		}
	}
	
	
	
	
	
}

