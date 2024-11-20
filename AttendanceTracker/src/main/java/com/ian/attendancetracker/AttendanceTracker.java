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
    
}



//
class AttendanceFunction {
    
    Scanner scanner = new Scanner(System.in);
    Set<AttendanceData> set = new HashSet<AttendanceData>();
    static int studentID = 0000;
    
    
    //add student name to the hashset
    public void addStudent() {
        
        System.out.print("Enter student name: ");
        String addName = scanner.nextLine().trim();  //to avoid more spaces
        int ID = studentID++;  //increment the student id
        
        AttendanceData newData = new AttendanceData(addName, ID);
        set.add(newData);
        System.out.println("Student Data added successfully!");      
    }
    
    
    //check if the student is in the attendance list 
    public void checkStudent() {
        
        System.out.print("Enter student name to check: ");
        String searchName = scanner.nextLine().trim();
        
        
    }
}


        
        
        
        
        
//main class
public class AttendanceTracker {

    public static void main(String[] args) {
        
    }
}
