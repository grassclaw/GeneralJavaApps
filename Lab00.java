// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// ASSIGNMENT: Lab00
/* PURPOSE: This applicaiton answers 7 questions provided by the Instructor
    -Constructor is utilized for student
    - System.out.print...etc. utilized for outputting values
*/
/*INPUTS
    - All inputs are hardcoded in this assignment
    - Scanner/Scanner.close() can be utilized in future
*/
/*OUTPUTS
    - Answers to 7 questions with lists as necessary are printed
    - 
*/
package javaActivities;

public class Lab00 {
    // instance fields
    String fullName;
    String[] priorCourseWork;
    String priorExperience;
    String courseMotivation;
    String courseConcern;
    String[] otherCommitments;
    String[] otherInterests;

    // constructor method - Values currently hardcoded on lines 43-49
    public Lab00(String name, String[] courses, String experience, String motivation, String concern, String[] commitments, String[] interests) {
        fullName = name;
        priorCourseWork = courses;
        priorExperience = experience;
        courseMotivation = motivation;
        courseConcern = concern;
        otherCommitments = commitments;
        otherInterests = interests;
    }

    // main method
    public static void main(String[] args) {
        //Variable assignments
        String name = "Aaron Escamilla, non major";
        String[] coursework = { "C++", "Macros on Excel", "Udemy WordPress" };
        String experience = "I currently work as a software developer using Golang.";
        String motivation = "I want to have a stronger understanding of CS theory.";
        String concern = "I really don't have the best memory sometimes.";
        String[] commitments = { "Full-time job", "Linear Algebra", "Tax Preperation" };
        String[] interests = { "Snowshoeing", "DIY house work" };

        //Declare new object
        Lab00 studentAaron = new Lab00(name, coursework, experience, motivation, concern, commitments, interests);

        //PRINT statements for objects set on lines 43-49
        System.out.println("Hello! My name's " + studentAaron.fullName + "."); 
        System.out.println("I've taken the following related courses: "); 
        for (String i : studentAaron.priorCourseWork){ //loop for listed items
            System.out.println("* "+i);
        }

        System.out.println("My experience with programming includes: " + studentAaron.priorExperience); 
        System.out.println("I'm taking this class because " + studentAaron.courseMotivation); 
        System.out.println("One of my concerns is that  " + studentAaron.courseConcern); 

        System.out.println("I have various other commitments and/or classes, namely: ");
        for (String i : studentAaron.otherCommitments){ //loop for listed items
            System.out.println("* "+i);
        }

        System.out.println("Some of my current interests are: ");
        for (String i : studentAaron.otherInterests){ //loop for listed items
            System.out.println("* "+i);
        }
    }
}
