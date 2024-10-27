package academy_project.questionaire_task_manager;


//Class representing a participant in the trial, extending the Person class
public class Participant extends Person {

 // Participant-specific attributes
 private String bloodType; // Participant's blood type
 private String genotype;   // Participant's genotype
 private boolean hasHealthConditions; // Indicates if the participant has health conditions

 // Constructor to initialize participant attributes
 public Participant(String name, int age, String bloodType, String genotype, boolean hasHealthConditions) {
     super(name, age); // Call the constructor of the superclass (Person) to set name and age
     this.bloodType = bloodType; // Assign the provided blood type to the bloodType field
     this.genotype = genotype;     // Assign the provided genotype to the genotype field
     this.hasHealthConditions = hasHealthConditions; // Assign the provided health condition status
 }

 // Getter for the participant's name (overrides the superclass method)
 @Override
 public String getName() {
     return super.getName(); // Return the name from the Person superclass
 }

 // Getter for the participant's age (overrides the superclass method)
 @Override
 public int getAge() {
     return super.getAge(); // Return the age from the Person superclass
 }

 // Getter for the participant's blood type
 public String getBloodType() {
     return bloodType; // Return the blood type of the participant
 }

 // Getter for the participant's genotype
 public String getGenotype() {
     return genotype; // Return the genotype of the participant
 }

    public boolean isHasHealthConditions() {
        return hasHealthConditions;
    }
    
    
}
