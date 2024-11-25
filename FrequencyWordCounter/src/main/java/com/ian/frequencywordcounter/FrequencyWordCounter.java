package com.ian.frequencywordcounter;



/*
    Description:
    Create a program that reads a string of text from the user and counts the frequency of each word.
*/


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;




public class FrequencyWordCounter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        
        System.out.print("Enter a string of text: ");
        String input = scanner.nextLine();
        
        // Step 3: Normalize the input (convert to lowercase and remove punctuation)
        String normalizedInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
        
        // Step 4: Split the string into words
        String[] words = normalizedInput.split("\\s+");
        
        //count the frequency of each words
        for(String copy : words ) {
            
            if(map.containsKey(copy)) {
                map.put(copy, map.get(copy) + 1);
            } else {
                map.put(copy, 1);
            }
        }
        
        // Step 7: Display the word frequencies
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
