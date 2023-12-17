import java.util.Scanner;
import java.util.Stack;

class Clipboard {
    private Stack<String> clipboardStack;

    public Clipboard() {
        clipboardStack = new Stack<>();
    }

    public void copy(String text) {
        clipboardStack.push(text);
        System.out.println("Copied: " + text);
    }

    public void paste() {
        if (!clipboardStack.isEmpty()) {
            String copiedText = clipboardStack.peek();
            System.out.println("Pasted: " + copiedText);
        } else {
            System.out.println("Clipboard is empty");
        }
    }
}

public class CopyPasteApp {
    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Copy");
            System.out.println("2. Paste");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter text to copy:");
                    String textToCopy = scanner.nextLine();
                    clipboard.copy(textToCopy);
                    break;
                case 2:
                    clipboard.paste();
                    break;
                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
