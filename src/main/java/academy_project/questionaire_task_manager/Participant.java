package academy_project.questionaire_task_manager;

import java.io.Serializable;

public class Participant implements Serializable {
   // private static final long serialVersionUID = 1L; // Unique identifier for serialization

    private String name;
    private int age;
    private String bloodType;
    private String genotype;
    private boolean hasHealthConditions;

    public Participant(String id, int age, String bloodType, String genotype, boolean hasHealthConditions) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.genotype = genotype;
        this.hasHealthConditions = hasHealthConditions;
    }

    // Getters
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
