/* Java program to Find and print the duplicate characters in a string */

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String input = "programming";

        // Create a map to store character frequency
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through the characters of the string
        for (char ch : input.toCharArray()) {
            // Update the frequency in the map
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
