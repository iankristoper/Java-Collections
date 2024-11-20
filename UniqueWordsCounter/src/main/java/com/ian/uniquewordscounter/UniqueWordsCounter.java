package com.ian.uniquewordscounter;


/*
    Description:
    Create a program that takes a string of text from the user and counts the number of unique words in the input.
*/


import java.util.Scanner;   //for inputs 
import java.util.Set;       //set interface -> no duplication, unorderred collections
import java.util.HashSet;   //set implementation -> use hashing algorithm, fast in look up, inserting, removing (same as set)




public class UniqueWordsCounter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Set<String> wordSet = new HashSet<String>();
        
        
        System.out.print("Enter a string of text: ");
        String words = scanner.nextLine().trim();
        
        words = words.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");  //make all words to lowercase, replace all punctations to blank
        String[] inputs = words.split("\\s+");  //splice the sentence into words 
        
        //add the inputs to the hashset
        for(String copy : inputs) {
            wordSet.add(copy);
        }
        
        System.out.println("Total number of unique words: " + wordSet.size());
        
        for(String copy : wordSet) {
            System.out.println("Word: " + copy);
        }
        
        scanner.close();
    }
}
