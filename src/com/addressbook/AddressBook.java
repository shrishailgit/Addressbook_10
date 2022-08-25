package com.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	Scanner scanner =new Scanner(System.in); 
	List <Contacts> arraylist =new ArrayList();
	
	 public void operation() {
		
		 
		 System.out.println("Choose Operation Which You Want");
         System.out.println("1. Add 2. Edit.3.Delete");

         switch (scanner.nextInt()) {
			
			case 1:
                add();
                break;
            case 2:
                edit();
                break;
           
            case 3:
                delete();
                break;
               
            }
	}

	  public void add() {
	       Contacts contacts = new Contacts();
	  
	        AddressBook addressbook =new AddressBook();
	        
	        System.out.println("Enter the First name");
	        String fname = scanner.next();
	        contacts.setFirstname(fname);

	        System.out.println("Enter the Last name");
	        String lname = scanner.next();
	        contacts.setLastname(lname);

	        System.out.println("Enter the Phone Number");
	        Long phone = scanner.nextLong();
	        contacts.setPhonenumber(phone);

	        System.out.println("Enter the City");
	        String city = scanner.next();
	        contacts.setCity(city);

	        System.out.println("Enter the Zip");
	        long zip = scanner.nextLong();
	        contacts.setZip(zip);

	        System.out.println("Enter the State");
	        String state = scanner.next();
	        contacts.setState(state);
	        
	        System.out.println("Enter the addres");
	        String address =scanner.next();
	        contacts.setAddress(address);
	        
	        arraylist.add(contacts);

	    }
	  
	  
	  public void edit() {
	        System.out.println("Enter your First name");
	        String fname = scanner.next();

	        Iterator<Contacts> iterator = arraylist.listIterator();

	        while (iterator.hasNext()) {
	            Contacts contacts = iterator.next();

	            if (fname.equals(contacts.getFirstname())) {
	            	
	          
	            	// AddressBook address = Contacts.getAddress();
	            	
	                System.out.println("Choose field you want to add");
	                System.out
	                        .println("1.Last Name 2.Phone Number 3.City 4.Zip 5. State");
	                switch (scanner.nextInt()) {
	                    case 1:
	                        System.out.println("Re-Correct your lastname");
	                        contacts.setLastname(scanner.next());
	                        break;
	                    case 2:
	                        System.out.println("Re-Correct your Phone Number");
	                        contacts.setPhonenumber(scanner.nextLong());
	                        break;
	                    case 3:
	                        System.out.println("Re-Correct your City");
	                        contacts.setCity(scanner.next());
	                        break;
	                    case 4:
	                        System.out.println("Re-Correct your Zip");
	                        contacts.setZip(scanner.nextLong());
	                        break;
	                    case 5:
	                        System.out.println("Re-Correct your State");
	                        contacts.setState(scanner.next());
	                        break;
	                }

	                
	                
	            }
	        }

	  }

	  public void delete() {
		  System.out.println("Enter your First name:");
		  String fname = scanner.next();

		  Iterator<Contacts> iterator = arraylist.listIterator();
		  while (iterator.hasNext()) {
			  Contacts person = iterator.next();

			  if (fname.equals(person.getFirstname())) {
				  arraylist.remove(person);
			  }
		  }
	  }
	}