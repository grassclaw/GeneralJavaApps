// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/28/2020
// ASSIGNMENT: Lab06a - Name formatter
/* PURPOSE: Arrange names alphabetical or revers
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> 
    - named user input variables --
        - string --> name1, name2, name3, alpha (indicating yes to alphabetical)
    - named calculated variables --
        - string --> nameStore1 (placeholder), nameStore2, nameStore3
*/
/*PROCESSING SECTION
    - Part 1: Format names for proper formatting
    - Part 2: Aarange names according to user input
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: Betty, Alice, Connie / Alice, Connie, Betty / connie, alice, BettY
***********************************************************************************************/

import java.util.*;

public class Lab06a {

    public static void main(String[] args) {
        String name1, name2, name3;
        String nameStore1 = "";
        String nameStore2 = "";
        String nameStore3 = "";
        String alpha;

        Scanner stdin = new Scanner(System.in);

        System.out.println("This program will ask for three first names,");
        System.out.println("and the order in which they should be displayed.");
        System.out.println("Then the names will be displayed in the order requested.");
        System.out.println();

        System.out.print("Enter the first name: ");
        name1 = stdin.nextLine();
        name1 = name1.substring(0, 1).toUpperCase() + name1.substring(1).toLowerCase();
        System.out.print("Enter the second name: ");
        name2 = stdin.nextLine();
        name2 = name2.substring(0, 1).toUpperCase() + name2.substring(1).toLowerCase();
        System.out.print("Enter the third name: ");
        name3 = stdin.nextLine();
        name3 = name3.substring(0, 1).toUpperCase() + name3.substring(1).toLowerCase();
        System.out.print("Do you want the names in reverse alphabetical order? (Yes or No) ");
        alpha = stdin.nextLine();

        stdin.close();

        if (alpha.equalsIgnoreCase("No")) {
            // alphabetical
            if (name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0) {
                nameStore1 = name1;
                if (name2.compareToIgnoreCase(name3) < 0) {
                    nameStore2 = name2;
                    nameStore3 = name3;
                } else {
                    nameStore2 = name3;
                    nameStore3 = name2;
                }
            } else if (name2.compareToIgnoreCase(name3) < 0 && name2.compareToIgnoreCase(name3) < 0) {
                nameStore1 = name2;
                if (name1.compareToIgnoreCase(name3) < 0) {
                    nameStore2 = name1;
                    nameStore3 = name3;
                } else {
                    nameStore2 = name3;
                    nameStore3 = name1;
                }

            } else {
                nameStore1 = name3;
                if (name1.compareToIgnoreCase(name2) < 0) {
                    nameStore2 = name1;
                    nameStore3 = name2;
                } else {
                    nameStore2 = name2;
                    nameStore3 = name1;
                }
            }
        } else if (alpha.equalsIgnoreCase("Yes")) {
            // reverse alphabetical
            if (name1.compareToIgnoreCase(name2) > 0 && name1.compareToIgnoreCase(name3) > 0) {
                nameStore1 = name1;
                if (name2.compareToIgnoreCase(name3) > 0) {
                    nameStore2 = name2;
                    nameStore3 = name3;
                } else {
                    nameStore2 = name3;
                    nameStore3 = name2;
                }
            } else if (name2.compareToIgnoreCase(name3) > 0 && name2.compareToIgnoreCase(name3) > 0) {
                nameStore1 = name2;
                if (name1.compareToIgnoreCase(name3) > 0) {
                    nameStore2 = name1;
                    nameStore3 = name3;
                } else {
                    nameStore2 = name3;
                    nameStore3 = name1;
                }

            } else {
                nameStore1 = name3;
                if (name1.compareToIgnoreCase(name2) > 0) {
                    nameStore2 = name1;
                    nameStore3 = name2;
                } else {
                    nameStore2 = name2;
                    nameStore3 = name1;
                }
            }
        } else {
            System.out.println("You answered neither yes or no.");
            System.out.println();
            return;
        }

        System.out.println(nameStore1);
        System.out.println(nameStore2);
        System.out.println(nameStore3);
        System.out.println("Done sorting and dispayling.");
        System.out.println();
    }

}
