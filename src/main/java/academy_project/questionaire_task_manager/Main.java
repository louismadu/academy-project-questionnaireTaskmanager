package academy_project.questionaire_task_manager;

import java.util.Scanner;

// Main class to run the application
public class Main {
    public static void main(String[] args) {
        Trial trial = new Trial(); // Create a new trial instance
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        String choice; // Variable to hold user choice

        // Loop to display options until user chooses to exit
        do {
            System.out.println("1. Add Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine(); // Read user choice

            // Switch-case to handle user choice
            switch (choice) {
                case "1":
                    trial.addParticipant(); // Add a participant
                    break;
                case "2":
                    trial.displayParticipants(); // Display all participants
                    break;
                case "3":
                    System.out.println("Exiting the application. Thank you!"); // Exit message
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); // Error message for invalid input
            }
        } while (!choice.equals("3")); // Continue until exit choice

        scanner.close(); // Close the scanner
    }
}
