package com.ian.attendancetracker;


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


/*
    Description:
    Build an application to manage student attendance in a class. Use a Set to track which students attended a specific session.
*/



class AttendanceData {
    
    private String name;
    private int id;
    
    
    //constructor for the class [AttendanceData]
    public AttendanceData(String name, int id) {
        this.id = id;
        this.name = name;
    }
    
    
    //getters 
    public int getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    //setters 
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "ID: " + getID() + "\n" +
               "Name: " + getName();
    }
    
    
    /*
        NOTE: since the default comparison of the hashcode() and the equals() is the internal memory, it is needed to be overridden in order
        to make that the user input will be teh data to be compared on.

        use this code: 

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AttendanceData that = (AttendanceData) obj;
            return name.equalsIgnoreCase(that.name);
        }

        @Override
        public int hashCode() {
            return name.toLowerCase().hashCode();
        }
    */
}



//
class AttendanceFunction {
    
    Scanner scanner = new Scanner(System.in);
    Set<AttendanceData> set = new HashSet<AttendanceData>();
    static int studentID = 1000;
    
    
    //add student name to the hashset
    public void addStudent() {
        
        System.out.print("Enter student name: ");
        String addName = scanner.nextLine().trim();  //to avoid more spaces
        int ID = studentID++;  //increment the student id
        
        AttendanceData newData = new AttendanceData(addName, ID);
        set.add(newData);
        System.out.println("Student Data added successfully!");  
        System.out.println("");
    }
    
    
    //check if the student is in the attendance list 
    public void checkStudent() {
        
        System.out.print("Enter student name to check: ");
        String searchName = scanner.nextLine().trim();
        
        for(AttendanceData copy : set) {
            
            if(copy.getName().equalsIgnoreCase(searchName)) {
                System.out.println(copy);
                System.out.println("");
                break;
            }
        }
    }
    
    
    //display all list of the student who attended
    public void displayAllStudents() {
        
        System.out.println("List of student who attend: ");
        System.out.println("");
        
        for(AttendanceData copy : set) {
            System.out.println(copy);
        }
    }  
}

         
        
//main class
public class AttendanceTracker {

    public static void main(String[] args) {
        
        AttendanceFunction function = new AttendanceFunction();
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning) {
            
            System.out.println("Welcome to my student attendance tracker [CLI based]");
            System.out.println("[1] Add student");
            System.out.println("[2] Check student");
            System.out.println("[3] Display all student");
            System.out.println("[4] Exit");
            
            System.out.print("Please select your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                                
                case 1:
                    System.out.println("");
                    function.addStudent();
                    break;
                    
                case 2:
                    System.out.println("");
                    function.checkStudent();
                    break;
                    
                case 3:
                    System.out.println("");
                    function.displayAllStudents();
                    break;
                    
                case 4:
                    isProgramRunning = false;
                    
                default:
                    System.out.println("");
                    System.out.println("Invalid choices!");
                    break;                                    
            }
        }
        
        scanner.close();
    }
}




