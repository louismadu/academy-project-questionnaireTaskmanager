package academy_project.questionaire_task_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trial trial = new Trial(); // Create a new trial instance
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        String choice; // Variable to hold user choice

        // Loop to display options until user chooses to exit
        do {
            System.out.println(ConsoleColors.BLUE + "1. Add Participant" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "2. Display Participants" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE + "3. Exit" + ConsoleColors.RESET);
            System.out.print(ConsoleColors.YELLOW + "Choose an option: " + ConsoleColors.RESET);
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
                    System.out.println(ConsoleColors.GREEN + "Exiting the application. Thank you!" + ConsoleColors.RESET);
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Invalid option. Please try again." + ConsoleColors.RESET); // Error message for invalid input
            }
        } while (!choice.equals("3")); // Continue until exit choice

        scanner.close(); // Close the scanner
    }
}
