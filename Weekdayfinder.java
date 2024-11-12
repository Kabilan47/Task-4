import java.util.Scanner;

public class Weekdayfinder {
    public static void main(String[] args) {
        // Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for day position
            System.out.print("Enter day index (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print the corresponding day name
            System.out.println("Day at index " + dayIndex + " is " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index input
            System.out.println("Error: Invalid day index. Please enter a number between 0 and 6.");
        } finally {
            scanner.close();  // Close scanner resource
        }
    }
}
