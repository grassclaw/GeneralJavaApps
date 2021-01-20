// Part 1/5
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 11pm
// COMPLETION: 12/10/2020
// ASSIGNMENT: Final Project - DiceGame
/* PURPOSE: This applicaiton 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - Perform various array exercises as listed below
*/

/*   
1. unique3x3 – accepts a 3x3 array of int and returns true if the array
contains each of the nine values 1 through 9 exactly once, otherwise false.
There are nine elements in the array, so each value (1..9) must appear in the
array exactly once.  
2. generateTable – accepts no formal parameters but returns a two-dimensional array of int of size 9X9 filled with random values
between 1 and 9, inclusive.
3. showTable – accepts a two-dimensional array of int of any size (all rows have the same number of columns) and displays the
values in row-major order, one row per line. For example, displaying a 9X9 array would look like the following:
6 6 1 5 7 3 5 2 9
4 4 1 3 9 7 8 6 6
5 7 9 9 3 4 3 1 1
1 3 3 5 1 4 8 2 9
5 3 5 5 5 4 8 9 2
4 2 3 4 1 4 2 5 9
4 9 7 8 4 5 3 1 8
9 1 1 9 2 7 5 4 6
3 6 6 1 2 4 6 4 3 
4. findUnique3x3s – accepts a 9x9 array of int and searches for all 3x3 sub-grids within this array that contain the values 1 through 9,
inclusive, exactly once. This method displays the subscripts of the element in the upper left hand corner of each unique grid found,
then returns the number of such unique sub-grids found in the entire 9x9 array (formal parameter). In designing this method you
may want to use unique3x3 (#1 above) and/or write one or more other methods to assist in this task. Note that in a 9x9 grid there
are 49 sub-grids of size 3x3. 

2 2 3 4 5 6 7 8 9
4 5 3 7 6 9 1 3 3
7 8 3 1 5 3 3 8 6
1 2 3 9 2 6 7 8 9
4 3 6 7 4 8 1 2 3
7 8 9 4 6 3 4 9 6
1 5 3 4 8 6 7 8 9
4 5 6 7 8 9 1 2 3
7 8 9 1 8 3 4 7 6 
*/
/*ERRORS
    -NONE
*/
/***********************************************************************************************/
import java.util.*;

public class TwoDimArrays {
    final static int SIDES = 3;
    final static int MIN = 1;
    final static int MAX = 9;

    public static void main(String[] args) {
        // TEST CASES
        char testCase = '1';
        int[][] m1 = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
  /*       int[][] m2 = { { 2, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 3, 7, 6, 9, 1, 3, 3 }, { 7, 8, 3, 1, 5, 3, 3, 8, 6 },
                { 1, 2, 3, 9, 2, 6, 7, 8, 9 }, { 4, 3, 6, 7, 4, 8, 1, 2, 3 }, { 7, 8, 9, 4, 6, 3, 4, 9, 6 },
                { 1, 5, 3, 4, 8, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 8, 3, 4, 5, 6 } }; */
        int[][] m3= {
            {1,2,3,4,5,6,7,8,9},
            {4,5,6,7,8,9,1,2,3},
            {7,8,9,1,2,3,4,5,6},
            {1,2,3,4,5,6,7,8,9},
            {4,5,6,7,8,9,1,2,3},
            {7,8,9,1,2,3,4,5,6},
            {1,2,3,4,5,6,7,8,9},
            {4,5,6,7,8,9,1,2,3},
            {7,8,9,1,2,3,4,5,6},
        };

        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome! Below are methods you can test for arrays :)");
        System.out.println("1 - unique3x3");
        System.out.println("2 - showTable");
        System.out.println("3 - generateTable ");
        System.out.println("4 - findUnique3x3");
        System.out.println("5 - Exit");
        System.out.print("Please select which function you would like to test (1-5): ");

        while (stdin.hasNextLine()) {
            testCase = stdin.nextLine().charAt(0);
            Random rand = new Random();
            int flip = rand.nextInt(2);

            switch (testCase) {
                case '1':// Check if 3x3 matrix has all values 1-9
                    int[][] m = m1;
                    if (flip == 0) {
                        m = m1;
                    } else {
                        m = generateTable(SIDES, SIDES);
                    }
                    System.out.println("Using array m: ");
                    showTable(m);
                    boolean s = unique3x3(m);
                    System.out.printf("Is the 3x3 matrix uniquely 1-9: %b\n", s);
                    break;
                case '2': // Generates a random 3x3 array values 1-9
                    System.out.println("Generated the 3x3 array: ");
                    showTable(generateTable(SIDES, SIDES));
                    break;
                case '3':// Prints any size 2D array
                    System.out.println("Showing array m: ");
                    showTable(generateTable(SIDES, SIDES));
                    break;
                case '4':// find unique 3x3 in the 9x9
                    int[][] n = m2;
                    int f = 0;
                    if (flip == 0) {
                        m = m3;
                    } else {
                        m = generateTable(9, 9);
                    }
                    System.out.println("Searching for unique grids in the following table: ");
                    showTable(m);
                    System.out.printf(" Found %d unique sub-grids.\n", findUnique3x3(m));
                    break;
                case '5': // exit
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.print("Invalid option!\n");
            }
            // hard to break out of a switch and while
            if (testCase == '5') {
                break;
            }
            System.out.print("Please select which function you would like to test (1-5): ");

        }
        stdin.close();
    }

    // unique3x3 checks the matrix is unique 1-9 valued
    private static boolean unique3x3(int[][] mat3) {
        int[] dedup = new int[9];
        int arrCount = 0;
        boolean u = true;
        for (int i = 0; i < SIDES; i++) {
            for (int j = 0; j < SIDES; j++) {
                if (mat3[i][j] < 10 && mat3[i][j] > 0) {
                    for (int n : dedup) {
                        if (n == mat3[i][j]) {
                            return false;
                        }
                    }
                    if (u = true) {
                        dedup[arrCount] = mat3[i][j];
                        arrCount++;
                    }
                } else {
                    u = false;
                }
            }
        }
        return u;
    }

    private static void showTable(int[][] m) {
        // Loop through all rows
        for (int i = 0; i < m.length; i++) {
            System.out.print("{");
            // Loop through all elements of current row
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j != m[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("}\n");
        }
    }

    private static int[][] generateTable(int side1, int side2) {
        int m[][] = new int[side1][side2];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * MAX);
            }
        }
        return m;
    }

    private static int findUnique3x3(int[][] m) {
        int[][] n = new int[3][3];
        boolean u = false;
        int uCount = 0;
        // Primary loop for checking 9x9 matrix value by value
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                // loop for creating minor 3x3 matrices
                int r = 0;// row iterator for 3x3 matrix
                for (int k = i; k < i + 3; k++) {
                    int c = 0; // column iterator for 3x3 matrix
                    for (int l = j; l < j + 3; l++) {
                        n[r][c] = m[k][l];
                        c++;
                    }
                    r++;
                }
                u = unique3x3(n);
                if (u) {
                    System.out.println("Unique 3x3 at [" + i + "," + j + "]");
                    uCount++;
                }
                u = false;
            }
        }
        return uCount;
    }
}