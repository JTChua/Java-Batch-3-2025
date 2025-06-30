import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {

    // Create a Scanner object to read input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.println("Enter a string to check if it is a palindrome:");
    String input = scanner.next();

    // Create a StringBuilder object and reverse the input string
    StringBuilder stringBuilder = new StringBuilder(input);
    String reversedString = stringBuilder.reverse().toString();

    // Check if the input string is a palindrome
    if (input.equals(reversedString)) {
      System.out.println("The input string is a palindrome.");
    } else {
      System.out.println("The input string is not a palindrome.");
    }

    // Close the scanner
    scanner.close();

  }

}