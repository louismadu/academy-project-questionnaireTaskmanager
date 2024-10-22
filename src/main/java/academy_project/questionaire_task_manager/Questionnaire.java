package academy_project.questionaire_task_manager;

import java.util.Scanner;

// Class to manage the questionnaire for participants
public class Questionnaire {
    private Scanner scanner; // Scanner for user input

    // Constructor initializes the scanner
    public Questionnaire() {
        scanner = new Scanner(System.in);
    }

    // Method to collect participant information and return a Participant object
    public Participant collectParticipantInfo() {
        String name = promptForName();
        int age = promptForAge();
        String bloodType = promptForBloodType();
        String genotype = promptForGenotype();
        boolean hasHealthConditions = promptForHealthConditions();

        return new Participant(name, age, bloodType, genotype, hasHealthConditions);
    }

    // Prompts user for name and validates it
    private String promptForName() {
        while (true) {
            System.out.print("Enter participant name: ");
            String name = scanner.nextLine();
            try {
                validateName(name); // Validate the entered name
                return name; // Return valid name
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Print error message
            }
        }
    }

    // Validates the name
    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Name must contain only letters and spaces.");
        }
    }

    // Prompts user for age and validates it
    private int promptForAge() {
        while (true) {
            try {
                System.out.print("Enter participant age (1-100): ");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 1 || age > 100) {
                    throw new IllegalArgumentException("Age must be between 1 and 100.");
                }
                return age; // Return valid age
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for age."); // Error message for non-integer input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Print age validation error
            }
        }
    }

    // Prompts user for blood type and validates it
    private String promptForBloodType() {
        while (true) {
            System.out.print("What is your blood type? (A, B, AB, O): ");
            String bloodType = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            if (bloodType.matches("A|B|AB|O")) {
                return bloodType; // Return valid blood type
            } else {
                System.out.println("Invalid blood type. Please enter A, B, AB, or O."); // Error message
            }
        }
    }

    // Prompts user for genotype and validates it
    private String promptForGenotype() {
        while (true) {
            System.out.print("What is your genotype? (AA, AO, BB, BO, AB, OO): ");
            String genotype = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            if (genotype.matches("AA|AO|BB|BO|AB|OO")) {
                return genotype; // Return valid genotype
            } else {
                System.out.println("Invalid genotype. Please enter AA, AO, BB, BO, AB, or OO."); // Error message
            }
        }
    }

    // Prompts user about existing health conditions
    private boolean promptForHealthConditions() {
        while (true) {
            System.out.print("Do you have any existing health conditions? (yes/no): ");
            String response = scanner.nextLine().toLowerCase(); // Convert input to lowercase
            if (response.equals("yes")) {
                return true; // Return true if health conditions exist
            } else if (response.equals("no")) {
                return false; // Return false if no health conditions
            } else {
                System.out.println("Invalid input. Please answer with 'yes' or 'no'."); // Error message
            }
        }
    }
}
