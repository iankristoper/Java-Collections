package com.ian.contactmanager;




/*
Description:
    Create a Contact Manager application that allows users to store and manage contacts. 
    Each contact will have a name, phone number, and email. Use an ArrayList<Contact> to store the contacts, where Contact is a custom class.
*/




//imported packages or libraries 
import java.util.List;        //list interface -> orderred collections, allowed duplicates
import java.util.ArrayList;   //list implementation
import java.util.Scanner;     //handling the inputs 
import java.util.Collections; //for sorting the list -> but implements the comparable and override the the int compareTo()




//class for the data of the contact manager
class ContactData implements Comparable<ContactData>{
    
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
    
    //method overriding -> uncomment to modify and create your own toString()
    //@Override
    //public String toString() {
        //return "sample only!";
    //}   
    
    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number + ", Email: " + email;
    }
    
    @Override
    public int compareTo(ContactData other) {
        return this.name.compareToIgnoreCase(other.name); // Sort alphabetically by name
    }   
}


//class for contact functions 
class ContactFunctions {
    
    Scanner scanner = new Scanner(System.in);
    List<ContactData> contactList = new ArrayList<ContactData>();   
    
    
    //method to add contact
    public void addContact() {
        
        System.out.print("Enter contact name: ");
        String contactName = scanner.nextLine().trim();
        
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine().trim();
        
        System.out.print("Enter contact email: ");
        String contactEmail = scanner.nextLine().trim();
        
        ContactData contact = new ContactData(contactName, contactNumber, contactEmail);
        contactList.add(contact); //add newly initialized contact to the contactList List       
        System.out.println("Contact added successfully!");
        
        //--add method to sort the contact list here--  
        Collections.sort(contactList);     
    }
    
    
    //method to remove contact
    public void removeContact() {
        
        if(contactList.isEmpty()) {
            System.out.println("Contact Manager si empty! [404 Not found]");
            return; //early return
        }
        
        System.out.print("Enter contact number to delete: ");
        String removeContact = scanner.nextLine().trim();
        
        //loop to remove contact
        for(ContactData copy : contactList) {
            if(copy.getNumber().equalsIgnoreCase(removeContact)) {
                contactList.remove(copy);
                System.out.println("Contact has been remove successfully!");
                break;
            } 
        }
    }
    
    
    //methods to update the contact details
    public void updateContact() {
        
        if(contactList.isEmpty()) {
            System.out.println("Contact Manager si empty! [404 Not found]");
        }
        
        System.out.print("Enter contact number to update: ");
        String updateContact = scanner.nextLine().trim();
        
        //loop to get the details of the contact wanted to upadate
        for(ContactData copy : contactList) {
            if(copy.getNumber().equalsIgnoreCase(updateContact)) {
                System.out.println("Contact name to be update: " + copy.getName());
                
                System.out.print("Enter new name: ");
                String updateName = scanner.nextLine().trim();
                
                System.out.print("Enter new number: ");
                String updateNumber = scanner.nextLine().trim();
                
                System.out.print("Enter new email: ");
                String updateEmail = scanner.nextLine().trim();
                
                copy.setName(updateName);
                copy.setNumber(updateNumber);
                copy.setEmail(updateEmail);
                
                System.out.println("Contact details updated successfully!");
                break;
            }
        }
    }
    
    
    //method to view all contacts
    public void viewContact() {
        
        if(contactList.isEmpty()) {
            System.out.println("Contact Manager si empty! [404 Not found]");
            return; //early return
        }
        
        for(ContactData copy : contactList) {
            System.out.println(copy);
        }
        
        System.out.println("===================");
    }
    
    
    //
    public void searchContact() {
        
        boolean contactFound = false;
        
        if(contactList.isEmpty()) {
            System.out.println("Contact Manager si empty! [404 Not found]");
            return; //early return 
        }
        
        System.out.print("Enter name: ");
        String searchName = scanner.nextLine();
        
        for(ContactData copy : contactList) {
            if(copy.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Contact Details");
                System.out.println(copy);
                contactFound = true;
            }
        }
        
        if(!contactFound) {
            System.out.println("Contact not found!");
        }
    }
}




//main class
public class ContactManager {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ContactFunctions function = new ContactFunctions();
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning) {
            
            System.out.println("");
            System.out.println("Contact Manager [CLI Based]");
            System.out.println("[1] Add contact");
            System.out.println("[2] Remove contact");
            System.out.println("[3] Update contact");           
            System.out.println("[4] Search");
            System.out.println("[5] View all contacts");
            System.out.println("[6] Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine().trim();
            
            switch(choice) {
                
                case 1:
                    System.out.println("");
                    function.addContact();
                    break;
                    
                case 2: 
                    System.out.println("");
                    function.removeContact();
                    break;
                    
                case 3: 
                    System.out.println("");
                    function.updateContact();
                    break;
                    
                case 4:
                    System.out.println("");
                    function.searchContact();
                    break;
                    
                case 5:
                    System.out.println("");
                    function.viewContact();
                    break;
                    
                case 6:
                    isProgramRunning = false;
                    break;
                    
                    
                default:
                    System.out.println("");
                    System.out.println("Invalid choice, Try again.");
                    break;                 
            }
        }
        
        scanner.close();
    }
}
