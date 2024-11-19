package com.ian.todolist;



/*
    Description:
    Create a simple To-Do List application that allows a user to add, remove, and view tasks. Use an ArrayList to store the tasks.
*/



import java.util.Scanner;   //for inputs 
import java.util.List;      //list interface -> allowed duplicates, orderred collections
import java.util.ArrayList; //list implementations -> underlying structure is array




//this class is for data encapsulation
class TodoData {
    
    private String taskName;
    private String taskDescription;
    
    public TodoData(String taskName, String taskDescription) {  //contructor for the class [TOdoData]
        
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }
    
    //getters 
    public String getName() {      
        return taskName;
    }
    
    public String getDescription() {
        return taskDescription;
    }
    
    //setters
    public void setName(String taskName) {
        this.taskName = taskName;
    }
    
    public void setDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
    @Override
    public String toString() {
        return "sample";
    }
    
}



//this class is for the todo functions
class TodoFunctions {
    
    List<TodoData> list = new ArrayList<TodoData>();
    Scanner scanner = new Scanner(System.in);
    
    
    public void addTask() {
        
        System.out.print("Enter task name: ");
        String addTaskName = scanner.nextLine();
        
        System.out.print("Enter task description: ");
        String addTaskDescription = scanner.nextLine();
                 
        TodoData todoData = new TodoData(addTaskName, addTaskDescription);
        list.add(todoData);
        
        System.out.println("Task added successfully!");
    }
    
    
    public void removeTask() {
        
        System.out.print("Enter task name to remove: ");
        String removeTask = scanner.nextLine();
        
        
        for(TodoData copy : list) { 
            if(copy.getName().equalsIgnoreCase(removeTask)) {
                list.remove(copy);
                
                System.out.println("Task removed successfully!");
            }
        }
        
        System.out.println("Testing!");
    }
    
    
    public void displayTask() {
        
        System.out.println("All task:");
        
        for(TodoData copy : list) {
            System.out.println(copy);   //display toString()
        }
        
        System.out.println("_______________End line_________________");
    }
  
}




//main class
public class TodoList {

    public static void main(String[] args) {
        
        TodoFunctions function = new TodoFunctions();
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning) {
            
            System.out.println("Welcome to my simple Todo List");
            System.out.println("[1] Add task");
            System.out.println("[2] Remove task");
            System.out.println("[3] Display all task");
            System.out.println("[4] Exit");
            
            System.out.print("Please select your choices: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("\n");
            
            switch(choice) {
                
                case 1: 
                    function.addTask();
                    break;
                    
                case 2:
                    function.removeTask();
                    break;
                    
                case 3: 
                    function.displayTask();
                    break;
                    
                case 4:
                    System.out.println("Thank you for using...Program exit!");
                    isProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choices, Please try again.");
                    break;                  
                    
            }
            
        }
        
        scanner.close();
              
    }
}
