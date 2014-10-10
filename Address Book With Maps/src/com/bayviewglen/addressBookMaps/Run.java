package com.bayviewglen.addressBookMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Run {
	static Scanner scanner = new Scanner(System.in);
	static AddressBook aUsed;

	public static void main(String[] args) throws IOException, InterruptedException {
		mainMenu();
	}

	public static void mainMenu() throws IOException, InterruptedException {

		scanner = new Scanner(System.in);
		File file = new File("books/addressbook.txt");
		File file2 = new File("books/addressbook2.txt");


		AddressBook a1 = new AddressBook(file);
		AddressBook a2 = new AddressBook(file2);


		aUsed = a1;
		boolean validBook = false;
		System.out.println("Hello, welcome to your address book program.  Please select the address book you want to access:");
		while(!validBook){
			System.out.println("Enter the number of the book you want to access.");
			System.out.println("1. Address book one");
			System.out.println("2. Address book two");

			String tempChoice = scanner.nextLine();
			if(tempChoice.equals("1")){
				aUsed = a1;
				validBook = true;
			}
			else if(tempChoice.equals("2")){
				aUsed = a2;
				validBook = true;
			}
		}

		startAgain(aUsed);
	}


	public static void startAgain(AddressBook book) throws IOException, InterruptedException{
		boolean validMainMenu = false;
		while(!validMainMenu){
			System.out.println("What would you like to do now?");
			System.out.println("To search for a contact, enter (1)");
			System.out.println("To add a contact, enter (2)");
			System.out.println("To display your entire address book, enter (3)");
			System.out.println("To select a different address book, enter (4)");
			System.out.println("To quit, enter (5)");


			String choice = scanner.nextLine();
			String tempChoice2;

			if (choice.equals("4")){
				mainMenu();
			}
			else if(choice.equals("5")){
				System.out.println("Thanks for accessing address book, goodbye");
				System.exit(0);
			}
			else if(choice.equals("1")){
				boolean searchAgain = true;
				while(searchAgain){
					System.out.println("Enter something to search.  Either a first name, last name, or phone number");

					tempChoice2 = scanner.nextLine();

					if((aUsed.search(tempChoice2)) == null){
						System.out.println("Contact not found, sorry.");
						System.out.println();
						System.out.println();
						System.out.println("What now?");
						System.out.println("Search again (1)");
						System.out.println("Previous menu (2)");
						System.out.println("Quit (3)");
						String tempChoice = scanner.nextLine();
						if(tempChoice.equals("1")){
							searchAgain = true;
						}
						else if(tempChoice.equals("2")){
							startAgain(aUsed);
						}
						else if(tempChoice.equals("3")){
							System.out.println("Thanks for accessing address book, goodbye");
							System.exit(0);
						}

					}

					else{
						searchAgain = false;
						System.out.print("Searching.");
						Thread.sleep(400);
						System.out.print(".");
						Thread.sleep(400);
						System.out.println(".");
						Thread.sleep(400);
						System.out.println();
						System.out.println("Result:");
						aUsed.searchDisplay(tempChoice2);
						boolean tempChoice = false;
						while(!tempChoice){
							System.out.println("Options:");
							System.out.println("Delete a contact (1)");
							System.out.println("Previous menu (2)");
							System.out.println("Quit (3)");
							String deleteChoice = scanner.nextLine();
							if(deleteChoice.equals("2")){
								startAgain(aUsed);
								tempChoice = true;
							}
							else if(deleteChoice.equals("3")){
								System.out.println("Thanks for accessing address book, goodbye");
								System.exit(0);
							}
							else if(deleteChoice.equals("1")){
								searchAgain = false;
								boolean validDelete = false;
								while(!validDelete){
									try{
										System.out.println("Enter the number above the contact you wish to delete: ");
										String tempDelete = scanner.nextLine();
										int temp = Integer.parseInt(tempDelete);

										if(temp > aUsed.searchList(tempChoice2).size() || temp < 1){
											System.out.println("Not a valid entry");
											System.out.println();
											Thread.sleep(1000);
											tempChoice = true;
											validDelete = false;

										}else{
											validDelete = true;
											aUsed.removeContact(aUsed.searchList(tempChoice2).get(temp-1));
											System.out.println("Contact removed.");
											System.out.println();
											startAgain(aUsed);
										}
									}catch(Exception ex){
										System.out.println("Thats not an option");
									}
								}
							}
							else{
								tempChoice = false;
							}
						}
					}
					validMainMenu = true;
				}
			}
			else if(choice.equals("3")){
				aUsed.displayContacts();
				boolean tempAns = false;
				while(!tempAns){
					System.out.println("Options");
					System.out.println("Return to previous menu? (1)");
					System.out.println("Quit? (2)");

					String decision = scanner.nextLine();
					if(decision.equals("1")){
						startAgain(aUsed);
						tempAns = true;
					}
					else if(decision.equals("2")){
						System.out.println("Thanks for accessing address book, goodbye");
						System.exit(0);
						tempAns = true;
					}
					else{
						tempAns = false;
					}
				}
				validMainMenu = true;
			}else if(choice.equals("2")){
				boolean validFName = false;
				while(!validFName){
					System.out.println("Please enter the first name you would like this contact to have: ");
					String chosenFName = scanner.nextLine();
					if(chosenFName.contains(" ")){
						System.out.println("Please enter a name that doesn't have spaces in it");
					}
					else{
						validFName = true;
						boolean validLName = false;
						while(!validLName){
							System.out.println("Please enter the last name you would like this contact to have: ");
							String chosenLname = scanner.nextLine();
							if(chosenLname.contains(" ")){
								System.out.println("Please enter a name that doesn't have spaces in it");
							}
							else{
								validLName = true;
								boolean validPhone = false;
								while(!validPhone){
									System.out.println("Please enter the phone number you would like this contact to have, with the format xxx-xxx-xxxx");
									String chosenPhone = scanner.nextLine();
									if(chosenPhone.contains(" ")){
										System.out.println("Please enter a number that doesn't have spaces in it, use dashes.");
									}
									else{
										validPhone  = true;
										aUsed.addContact(chosenFName, chosenLname, chosenPhone);

										System.out.println("Contact added.");

										validMainMenu = true;
										startAgain(aUsed);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}


