package academy_project.questionaire_task_manager;

import java.util.Scanner;

// Class to manage the questionnaire for participants
public class Questionnaire extends ConsoleColors {
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

    private String promptForName() {
        while (true) {
            System.out.print(ConsoleColors.YELLOW + "Enter participant name: " + ConsoleColors.RESET);
            String name = scanner.nextLine();
            try {
                validateName(name); // Validate the entered name
                return name; // Return valid name
            } catch (IllegalArgumentException e) {
                System.out.println(ConsoleColors.RED + e.getMessage() + ConsoleColors.RESET); // Print error message
            }
        }
    }

    // Other methods remain the same...

    private void validateName(String name) {
		// TODO Auto-generated method stub
		
	}

	private int promptForAge() {
        while (true) {
            try {
                System.out.print(ConsoleColors.YELLOW + "Enter participant age (1-100): " + ConsoleColors.RESET);
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 1 || age > 100) {
                    throw new IllegalArgumentException("Age must be between 1 and 100.");
                }
                return age; // Return valid age
            } catch (NumberFormatException e) {
                System.out.println(ConsoleColors.RED + "Invalid input. Please enter a valid number for age." + ConsoleColors.RESET); // Error message
            } catch (IllegalArgumentException e) {
                System.out.println(ConsoleColors.RED + e.getMessage() + ConsoleColors.RESET); // Print age validation error
            }
        }
    }

    private String promptForBloodType() {
        while (true) {
            System.out.print(ConsoleColors.YELLOW + "What is your blood type? (A, B, AB, O): " + ConsoleColors.RESET);
            String bloodType = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            if (bloodType.matches("A|B|AB|O")) {
                return bloodType; // Return valid blood type
            } else {
                System.out.println(ConsoleColors.RED + "Invalid blood type. Please enter A, B, AB, or O." + ConsoleColors.RESET); // Error message
            }
        }
    }

    private String promptForGenotype() {
        while (true) {
            System.out.print(ConsoleColors.YELLOW + "What is your genotype? (AA, AO, BB, BO, AB, OO): " + ConsoleColors.RESET);
            String genotype = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            if (genotype.matches("AA|AO|BB|BO|AB|OO")) {
                return genotype; // Return valid genotype
            } else {
                System.out.println(ConsoleColors.RED + "Invalid genotype. Please enter AA, AO, BB, BO, AB, or OO." + ConsoleColors.RESET); // Error message
            }
        }
    }

    private boolean promptForHealthConditions() {
        while (true) {
            System.out.print(ConsoleColors.YELLOW + "Do you have any existing health conditions? (yes/no): " + ConsoleColors.RESET);
            String response = scanner.nextLine().toLowerCase(); // Convert input to lowercase
            if (response.equals("yes")) {
                return true; // Return true if health conditions exist
            } else if (response.equals("no")) {
                return false; // Return false if no health conditions
            } else {
                System.out.println(ConsoleColors.RED + "Invalid input. Please answer with 'yes' or 'no'." + ConsoleColors.RESET); // Error message
            }
        }
    }
}
