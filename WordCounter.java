// File Name: WordCounter.java

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // Get a sentence input from the user
        String sentence = getSentenceInput();
        
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }

    /**
     * This method prompts the user to enter a sentence and returns the input.
     * @return the entered sentence as a String
     */
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line as a sentence
    }

    /**
     * This method counts the number of words in the given sentence.
     * @param sentence the sentence to count words in
     * @return the number of words in the sentence
     */
    public static int countWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.trim().split("\\s+"); // Use regex to handle multiple spaces
        return words.length; // Return the length of the array as the word count
    }
}
