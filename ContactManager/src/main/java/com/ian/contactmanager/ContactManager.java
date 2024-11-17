package com.ian.contactmanager;


//imported packages or libraries 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;




//class for the data of the contact manager
class ContactData {
    
    private String name;
    private String number;
    private String email;
    
    //contructor for the class [ContactData] for initialization of data
    public ContactData(String name, String number, String email) {
        
        this.name = name;
        this.number = number;
        this.email = email;
        
    }
    
    //getters
    public String getName() {
        return name;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getEmail() {
        return email;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    //method overriding 
    @Override
    public String toString() {
        return "sample only!";
    }
    
}


//class for contact functions 
class ContactFunctions {
    
    Scanner scanner = new Scanner(System.in);
    List<ContactData> contactList = new ArrayList<ContactData>();
    
    
    //method to add contact
    public void addContact() {
        
        System.out.print("Enter contact name: ");
        String contactName = scanner.nextLine();
        
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        
        System.out.print("Enter contact email: ");
        String contactEmail = scanner.nextLine();
        
        ContactData contact = new ContactData(contactName, contactNumber, contactEmail);
        contactList.add(contact); //add newly initialized contact to the contactList List       
        System.out.println("Contact added successfully!");
        
        //--add method to sort the contact list here--
        
    }
    
    
    //method to remove contact
    public void removeContact() {
        
        System.out.print("Enter contact number to delete: ");
        String removeContact = scanner.nextLine();
        
        for(ContactData copy : contactList) {
            if(copy.getNumber().equalsIgnoreCase(removeContact)) {
                
            } 
        }
    }
    
    
   
    
}

















public class ContactManager {

    public static void main(String[] args) {
        
        
    }
}
