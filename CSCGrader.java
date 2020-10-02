// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/01/2020
// ASSIGNMENT: Lab06b - RunningTheRace
/* PURPOSE:  calculates a grade for a student enrolled in a CSC110 course based on four user inputs
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> assignment weights in grade (HW and test)
    - named user input variables --
        - Double --> % for 1-4 assignment
    - named calculated variables --
        - Double --> average, grade, rounded course score
        - String --> grade
*/
/*PROCESSING SECTION
    - Part 1: Determine average, grade percentage ?/100, and letter grade
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 95, 74, 63, 79 / 95, -2, 3, 59/ 59, 65, 46, -5 / 100, 100, 100, 59 / 40 100 101/ 40 40 40 60
*/
/* EXTRA REQUESTS
    -
*/
/***********************************************************************************************/
import java.util.Scanner;

public class CSCGrader {
    public static void main(String[] args){
        final double HW_WGT = .55;
        final double EXAM_WGT = .45;
        double score1, score2, score3;
        int finalScore = 100;
        double courseGrd, letterScore, prgmAvg;
        char letterGrd = 'A';

        java.util.Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome to CSCGrader");
        System.out.println("This program will calculate a CSC grade and display");
        System.out.println("the numeric grade and letter grade earned based on the");
        System.out.println("user's input: three program scores and a final exam score.");
        System.out.println("First you will enter the 3 programming scores:");
        System.out.print("   First program score: ");
        score1 = stdin.nextDouble();
        stdin.nextLine();
        System.out.print("   Second program score: ");
        score2 = stdin.nextDouble();
        stdin.nextLine();
        System.out.print("   Third program score: ");
        score3 = stdin.nextDouble();
        stdin.nextLine();
        
        if(score1 < 0 || score2 < 0 || score3 < 0 || score1 > 100 || score2 > 100 || score3 > 100){
            System.out.println("One of the program grades is out of the range 0..100");
            return;
        }
       
        System.out.println("Now you will enter the final exam score:");
        System.out.print("   Final exam score: ");
        finalScore = stdin.nextInt();
        stdin.nextLine(); 
        System.out.println();

        //The programming assignments are 55% of the course grade and the final exam is 45%
        prgmAvg = (score1 + score2 + score3)/3;
        courseGrd = prgmAvg * .55 + finalScore * .45;
        letterScore = Math.round(courseGrd);
        //if the final exam is below 60, then the course grade is automatically an F
        if(finalScore < 60){
            letterGrd = 'F';
        }else if(letterScore >= 90){
            letterGrd = 'A';
        }else if(letterScore >= 80){
            letterGrd = 'B';
        }else if(letterScore >= 70){
            letterGrd = 'C';
        }else if(letterScore >= 60){
            letterGrd = 'D';
        }else if(letterScore < 60){
            letterGrd = 'F';
        }

        System.out.println(" CSCGRADER Results:");
        System.out.println("Program scores entered:");
        System.out.printf("Final Exam score entered: %d\n", finalScore);
        System.out.printf("Program average: %6.2f\n", prgmAvg);
        System.out.printf("Course Grade: %9.2f\n", courseGrd);
        System.out.printf("Letter Grade: %4s\n", letterGrd);
       
        switch(letterGrd){
            case 'A':
                System.out.println("You'll do great in CSC205");
                break;
            case 'B': 
                System.out.println("You should have little difficulty in CSC205.");
                break;
            case 'C':
                System.out.println("You passed but may be challenged by CSC205.");
                break;
            case 'D':
                System.out.println("You will do much better next time you take this course.");
                break;
            case 'F':
                if(finalScore < 60){
                    System.out.println("You failed the final and therefore also the course.");
                    break;
                }
                System.out.println("You did not score high enough to pass the course.");
                break;
        }
        System.out.println("Thank you for using CSCGrader.");
        System.out.println();
    }
}
