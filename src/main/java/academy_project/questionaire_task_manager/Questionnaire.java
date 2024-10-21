package academy_project.questionaire_task_manager;

import java.util.Scanner;

public class Questionnaire {
    private Scanner scanner;

    public Questionnaire() {
        scanner = new Scanner(System.in);
    }

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
            System.out.print("Enter participant name: ");
            String name = scanner.nextLine();
            try {
                validateName(name);
                return name;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Name must contain only letters and spaces.");
        }
    }

    private int promptForAge() {
        while (true) {
            try {
                System.out.print("Enter participant age (1-100): ");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 1 || age > 100) {
                    throw new IllegalArgumentException("Age must be between 1 and 100.");
                }
                return age;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String promptForBloodType() {
        while (true) {
            System.out.print("What is your blood type? (A, B, AB, O): ");
            String bloodType = scanner.nextLine().toUpperCase();
            if (bloodType.matches("A|B|AB|O")) {
                return bloodType;
            } else {
                System.out.println("Invalid blood type. Please enter A, B, AB, or O.");
            }
        }
    }

    private String promptForGenotype() {
        while (true) {
            System.out.print("What is your genotype? (AA, AO, BB, BO, AB, OO): ");
            String genotype = scanner.nextLine().toUpperCase();
            if (genotype.matches("AA|AO|BB|BO|AB|OO")) {
                return genotype;
            } else {
                System.out.println("Invalid genotype. Please enter AA, AO, BB, BO, AB, or OO.");
            }
        }
    }

    private boolean promptForHealthConditions() {
        while (true) {
            System.out.print("Do you have any existing health conditions? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                return true;
            } else if (response.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please answer with 'yes' or 'no'.");
            }
        }
    }

}
