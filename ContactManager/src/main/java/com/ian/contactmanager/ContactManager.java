
package com.ian.contactmanager;

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
    
    
    
   
    
}

















public class ContactManager {

    public static void main(String[] args) {
        
        
    }
}
