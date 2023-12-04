/*
Count Vowels and Consonants:
Write a program to count the number of vowels and consonants in a given string.
*/
import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet
            if ((ch >= 'a' && ch <= 'z')) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);

        scanner.close();
    }
}
