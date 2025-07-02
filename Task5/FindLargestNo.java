
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindLargestNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Prompt user for three numbers
        System.out.println("Enter three numbers");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        // Check if all numbers are equal
        if (numbers.get(0).equals(numbers.get(1)) && numbers.get(1).equals(numbers.get(2))) {
            System.out.println("All numbers are equal.");
        } else {
            // Find the largest number
            int largest = numbers.get(0);
            for (int num : numbers) {
                if (num > largest) {
                    largest = num;
                }
            }
            System.out.println("The largest number is: " + largest);
        }

    }

}
