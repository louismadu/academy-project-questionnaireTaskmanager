package academy_project.questionaire_task_manager;

import java.util.ArrayList;
import java.util.List;

public class Trial {
    private List<Participant> participants;
    private Questionnaire questionnaire;

    public Trial() {
        participants = new ArrayList<>();
        questionnaire = new Questionnaire();
    }

    public void addParticipant() {
        Participant participant = questionnaire.collectParticipantInfo();
        
        // Check selection criteria
        if (isEligible(participant)) {
            participants.add(participant);
            System.out.println("Participant added successfully!");
        } else {
            System.out.println("Participant does not meet the eligibility criteria.");
        }
    }

    public boolean isEligible(Participant participant) {
        // Check if blood type is O and genotype is AA 
        boolean isBloodTypeEligible = participant.getBloodType().equalsIgnoreCase("O");
        
        boolean isGenotypeEligible = participant.getGenotype().equalsIgnoreCase("AA");
        
        // Check age range
        boolean isAgeEligible = participant.getAge() >= 20 && participant.getAge() <= 50;

        return isBloodTypeEligible && isGenotypeEligible && isAgeEligible;
    }

    public void displayParticipants() {
        System.out.println("Participants in the trial:");
        for (Participant p : participants) {
            System.out.println(" Name: " + p.getName() + ", Age: " + p.getAge() +
                               ", Blood Type: " + p.getBloodType() + ", Genotype: " + p.getGenotype() +
                               ", Health Conditions: " + (p.isHasHealthConditions() ? "Yes" : "No"));
        }
    }
}

