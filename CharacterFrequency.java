import java.util.*; // Importing required packages

public class CharacterFrequency {
    // Scanner object for user input
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompting the user to enter the content
        System.out.println("Enter your content: ");
        String text = sc.nextLine(); // Reading the input text from the user

        // Split the input text into words and calculate word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" "); // Splitting input text into words
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Displaying the word frequencies
        System.out.println(wordCount);

        // Calculating character frequencies (excluding spaces)
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c == ' ') { // Ignoring spaces
                continue;
            }
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Displaying the character frequencies
        System.out.println(charCount);
    }
}
