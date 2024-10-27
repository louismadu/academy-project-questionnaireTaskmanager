package academy_project.questionaire_task_manager;

//Class representing a person with basic attributes
public class Person {
 // Protected fields to store the name and age of the person
 protected String name; // Name of the person
 protected int age;     // Age of the person

 // Constructor to initialize a Person object with name and age
 public Person(String name, int age) {
     this.name = name; // Assign the provided name to the name field
     this.age = age;   // Assign the provided age to the age field
 }

 // Method to get the name of the person
 public String getName() {
     return name; // Return the name of the person
 }

 // Method to get the age of the person
 public int getAge() {
     return age; // Return the age of the person
 }
}
