package academy_project.questionaire_task_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trial trial = new Trial();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("1. Add Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    trial.addParticipant();
                    break;
                case "2":
                    trial.displayParticipants();
                    break;
                case "3":
                    System.out.println("Exiting the application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!choice.equals("3"));

        scanner.close();
    }
}
