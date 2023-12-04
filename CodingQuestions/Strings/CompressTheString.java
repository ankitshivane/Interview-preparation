/*
String Compression:
Implement a method to perform basic string compression using the counts of repeated characters.
What is meaning of this coding questions can you explain me with sample input and output
  input- "aaabbbccc"
output- "a3b3c3"
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

    public static String compressString(String input) {
        // Step 1: Build frequency map
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }

        // Step 2: Build compressed string
        StringBuilder compressed = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            compressed.append(entry.getKey()).append(entry.getValue());
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbccc";
        String compressed = compressString(input);
        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compressed);
    }
}
