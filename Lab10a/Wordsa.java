// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/13/2020
// ASSIGNMENT: Lab10a - Words game
/* PURPOSE: This applicaiton
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - Replicates the game of Hangman with the user. No hangman drawing is produced. 
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --
        - String --> file length, min file length of 0
        - char --> 
        - double --> 
        - int    -->  
    - named user input variables --
        - String --> letter gues, play again
        - char --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> word formats, random words, guesses good and bad, placeholder etc.
        - char --> 
        - double --> score percentage based on guess to length of word etc.
        - int    --> iterators for loops
*/
/*PROCESSING SECTION
    - Part 1: Get the random word
    - Part 2: Play hangman
*/
/*OUTPUTS
    - System output of updated word guess and progress as well as scores
    - Test cases: 
      --> Part 1: 
/*ERRORS
    -
*/
/***********************************************************************************************/
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Wordsa {
    static final int F_LEN = 33736;
    static final int MIN_LEN = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner stdin = new Scanner(System.in);
        boolean guessed = false;
        String badGuess = "";
        String goodGuess = "";
        String wordGuess = "";
        String playAgain = "y";
        String randWord = "";
        String lettGuess = "";
        char c;
        int randNum = 0;
        int gameCount = 0;
        int guessCount = 0;
        double bestScore = 0;
        double rollingScore = 0;
        double avgScore = 0;
        double score = 0; // sum of lettPerc and wlPerc
        double lettPerc = 0;
        double wlPerc = 0; // "word length percentage"
        File f = null;

        System.out.println("Welcome to Words: The Word Guessing Game!");
        System.out.println("Play as many games as you like. I'll remember your top score.");
        System.out.println("and also compute your average for all games played.");
        System.out.println();
        // This is the game Initiation
        while (!guessed) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
            // Round count
            gameCount++;

            // Retrieve random word
            randNum = (int) (Math.random() * (F_LEN - MIN_LEN) + MIN_LEN);
            f = new File("wordlist.txt");

            if (f.exists()) {
                Scanner fScan = new Scanner(f);
                while (fScan.hasNext()) {
                    // only needs to exist in this scope
                    String word = fScan.nextLine();
                    guessCount++;
                    if (guessCount == randNum) {
                        randWord = word;
                    }
                }
                guessCount = 0;
                fScan.close();
            } else {
                System.out.println("ERR: COULD NOT FIND FILE");
            }

            // Format random word to hidden format for user
            for (int i = 0; i < randWord.length(); i++) {
                char ch = randWord.charAt(i);
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                        || ch == 'u' || ch == 'U') {
                    wordGuess = wordGuess.concat("=");
                } else {
                    wordGuess = wordGuess.concat("-");
                }
            }
            // Guessing rounds/logic
            while (!guessed) {
                System.out.printf("Letters already guessed: %s\n", badGuess);
                System.out.printf("Guess a letter in this word: %s ?? ", wordGuess);

                lettGuess = stdin.nextLine().substring(0, 1);
                c = lettGuess.charAt(0);
                while (!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    System.out.print("Not a letter. Guess again: ");
                    lettGuess = stdin.nextLine().substring(0, 1);
                    c = lettGuess.charAt(0);
                }
                lettGuess = String.valueOf(c);
                
                if (goodGuess.indexOf(lettGuess) != -1 || badGuess.indexOf(lettGuess) != -1) {
                    System.out.println("==> " + lettGuess + " was already guessed.");
                } else {
                    if (randWord.indexOf(lettGuess) != -1) {
                        guessCount++;
                        for (int i = 0; i < randWord.length(); i++) {
                            if (randWord.substring(i, i + 1).equalsIgnoreCase(lettGuess)) {
                                wordGuess = wordGuess.substring(0, i) + lettGuess + wordGuess.substring(i + 1);
                            }
                        }
                        goodGuess = goodGuess.concat(lettGuess);
                    } else {
                        if (badGuess.indexOf(lettGuess) == -1) {
                            guessCount++;
                            badGuess = badGuess.concat(lettGuess);
                        }
                    }
                }

                // Game Over Check
                if (wordGuess.indexOf("-") == -1 && wordGuess.indexOf("=") == -1) {
                    // Set scores
                    lettPerc = 100 - guessCount / 26.0 * 100;
                    wlPerc = randWord.length() / 26.0 * 100;
                    score = lettPerc + wlPerc;
                    rollingScore += score;
                    avgScore = rollingScore / gameCount;
                    if (score >= bestScore) {
                        bestScore = score;
                    }

                    // Break loop and print final statements
                    guessed = true;
                    System.out.println();
                    System.out.printf("You guessed this word: %s in %d guesses!\n", randWord, guessCount);
                    System.out.printf("Your score: %.2f%s!\n", score, "%");
                    guessCount = 0;
                }
            }

            // Repeat Game?
            System.out.println();
            System.out.print("Want to play again? ");
            if (stdin.hasNextLine()) {
                playAgain = stdin.nextLine();
                while (!(playAgain.equalsIgnoreCase("n")) && !(playAgain.equalsIgnoreCase("y"))) {
                    System.out.print("Please enter 'y' or 'n'. Want to play again? ");
                    playAgain = stdin.nextLine();
                }
                if (playAgain.equalsIgnoreCase("y")) {
                    // reset params to rerun
                    guessed = false;
                    badGuess = "";
                    goodGuess = "";
                    wordGuess = "";
                } else {
                    System.out.println("Thanks for playing...");
                    System.out.printf("   Your best score was %.2f%s\n", bestScore, "!");
                    System.out.printf("   Your average score was %.2f%s\n", avgScore, "%");
                }
            }
            System.out.println();
        }
        stdin.close();
    }

}
