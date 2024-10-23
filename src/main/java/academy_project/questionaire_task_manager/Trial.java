package academy_project.questionaire_task_manager;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Trial {
    private List<Participant> participants; // List to store participants
    private Questionnaire questionnaire; // Instance of Questionnaire to collect participant info

    // Constructor initializes the participants list and questionnaire
    public Trial() {
        participants = new ArrayList<>();
        questionnaire = new Questionnaire();
    }

    // Method to add a participant to the trial
    public void addParticipant() {
        Participant participant = questionnaire.collectParticipantInfo(); // Collect participant info
        
        // Check selection criteria
        if (isEligible(participant)) {
            participants.add(participant); // Add participant if eligible
            System.out.println("Participant added successfully!");
            saveParticipantsToFile("eligible_participants.txt"); // Automatically save to file
        } else {
            System.out.println("Participant does not meet the eligibility criteria."); // Error message if not eligible
        }
    }

    // Method to determine if a participant is eligible based on criteria
    public boolean isEligible(Participant participant) {
        boolean isBloodTypeEligible = participant.getBloodType().equalsIgnoreCase("O");
        boolean isGenotypeEligible = participant.getGenotype().equalsIgnoreCase("AA");
        boolean isAgeEligible = participant.getAge() >= 20 && participant.getAge() <= 50;

        return isBloodTypeEligible && isGenotypeEligible && isAgeEligible;
    }

    // Method to save eligible participants to a file
    public void saveParticipantsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Participant p : participants) {
                String line = String.format("%s,%d,%s,%s,%b", 
                                             p.getName(), 
                                             p.getAge(), 
                                             p.getBloodType(), 
                                             p.getGenotype(), 
                                             p.isHasHealthConditions());
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Eligible participants saved to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to display all participants in the trial
    public void displayParticipants() {
        System.out.println(ConsoleColors.CYAN + "Participants in the trial:" + ConsoleColors.RESET);
        for (Participant p : participants) {
            System.out.println(ConsoleColors.GREEN + "Name: " + ConsoleColors.RESET + p.getName());
            System.out.println(ConsoleColors.GREEN + "Age: " + ConsoleColors.RESET + p.getAge());
            System.out.println(ConsoleColors.GREEN + "Blood Type: " + ConsoleColors.RESET + p.getBloodType());
            System.out.println(ConsoleColors.GREEN + "Genotype: " + ConsoleColors.RESET + p.getGenotype());
            System.out.println(ConsoleColors.GREEN + "Health Conditions: " + ConsoleColors.RESET + (p.isHasHealthConditions() ? "Yes" : "No"));
            System.out.println(); // Add a blank line for better readability
        }
    }

}
