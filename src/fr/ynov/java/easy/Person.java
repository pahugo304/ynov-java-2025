package fr.ynov.java.easy;

import java.time.LocalDate;
import java.time.Period;

enum Nationality {
    FRENCH, BRITISH, AMERICAN, GERMAN, SPANISH, ITALIAN, OTHER;
}

class Person {

    private String name;
    private String gender;
    private float height;
    private float weight;
    private LocalDate birthDate;
    private Nationality nationality;
    
    public Person(String name, LocalDate birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }
    
    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Nationality: " + nationality);
    }
    
    public static void main(String[] args) {
        Person person = new Person("Alice", LocalDate.of(1995, 5, 15), "Female", 1.68f, 60.5f, Nationality.FRENCH);
        person.printDetails();
    }
}
