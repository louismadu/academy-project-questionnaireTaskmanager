package academy_project.questionaire_task_manager;

//import java.io.Serializable;

// Class representing a participant in the trial
public class Participant {

    private String name; // Participant's name
    private int age; // Participant's age
    private String bloodType; // Participant's blood type
    private String genotype; // Participant's genotype
    private boolean hasHealthConditions; // Indicates if the participant has health conditions

    // Constructor to initialize participant attributes
    public Participant(String name, int age, String bloodType, String genotype, boolean hasHealthConditions) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.genotype = genotype;
        this.hasHealthConditions = hasHealthConditions;
    }

    // Getters for participant attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getGenotype() {
        return genotype;
    }

    public boolean isHasHealthConditions() {
        return hasHealthConditions;
    }
    
    
}
