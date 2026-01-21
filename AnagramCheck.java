import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {

    // Method to ask whether the two string are anagrams:
    public static void asking() {
        System.out.println ("Are the two words anagrams?");
    }

    // Helper method that contains the logic
    public static boolean isAnagram(String firstGivenString, String secondGivenString) {

        // First, checking if the two given strings have the same length:
        if (firstGivenString.length() != secondGivenString.length()) {
            return false;
        }

        HashMap<Character, Integer> anagramCheckerHashMap = new HashMap<>();

        // Add each character from the first string to the HashMap
        for (char c : firstGivenString.toCharArray()) {
            anagramCheckerHashMap.put(c, anagramCheckerHashMap.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using the second string
        for (char c : secondGivenString.toCharArray()) {
            if (anagramCheckerHashMap.getOrDefault(c, 0) == 0) {
                return false;
            }
            anagramCheckerHashMap.put(c, anagramCheckerHashMap.get(c) - 1);
        }

        // If we reach here, the strings are anagrams
        return true;
    }


    public static void main(String[] args) {
        
        // Creating the scanner to get user input.
        Scanner inputScanner = new Scanner(System.in);
        // Getting the first inputed string:
        System.out.println("Enter the first word: ");
        String firstGivenString = inputScanner.nextLine();
        // Getting the second inputed string:
        System.out.println("Enter the second word: ");
        String secondGivenString = inputScanner.nextLine();

        inputScanner.close();

        boolean result = isAnagram(firstGivenString.toLowerCase(), secondGivenString.toLowerCase());
        asking();
        System.out.println(result);

    }
}





