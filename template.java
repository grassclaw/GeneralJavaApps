// Part a
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 10/13/2020
// ASSIGNMENT: Lab07 - DiceGame
/* PURPOSE: This applicaiton 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
    - 
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --
        - String --> 
        - char --> 
        - double --> 
        - int    -->  
    - named user input variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
    - named calculated variables --
        - String --> 
        - char --> 
        - double --> 
        - int    --> 
*/
/*PROCESSING SECTION
    - Part 1: 
    - Part 2: 
*/
/*OUTPUTS
    - System output paragraph with inserted answers
    - Test cases: 
      --> Part 1: 
/*ERRORS
    -
*/
/***********************************************************************************************/
public class template {
    public static void main(String[] args) {

        // String[] names = new String[5];
        // for(int i=0;i<names.length;i++){
        // System.out.println("Hello "+i);
        // }
        // int x = 10;
        // switch (x) {
        // case 10:
        // x += 15;
        // case 12:
        // x -= 5;
        // break;
        // default:
        // x *= 3;
        // }
        // System.out.println("Hello " + x);
        // char c1 = 7;
        // char c2 = '7';
        // System.out.println(c1 + 2);
        // System.out.println(c2 + 2);
        // System.out.println(c1 == c2);

        // int x = 8, y = 25;
        // double z;
        // z = (double) (y / x) + 1;

        // System.out.println(z);

        // final int SUB = 12;
        // int[ ] x = new int[SUB];
        // int y = 10;
        // for(int i = 0; i < SUB; i++) {
        // x[i] = y;
        // y += 10;
        // System.out.println(x[i]);

        // }
        // System.out.println(x[0]);
        // String msg = "Final_Exam";
        // String msg1 = msg.toUpperCase();
        // String msg2 = msg.toLowerCase();
        // int x = msg1.lastIndexOf("A");
        // int y = msg1.indexOf('A');
        // int z = msg1.indexOf('_');
        // System.out.println(msg);
        // System.out.println(msg1);
        // System.out.println(msg2);
        // System.out.println(msg1.substring( y , z ) + msg1.substring( z+1 , x ));

        // int[] array = { 8, 4, 7, 3, 2 };
        // int n = 12;
        int[][] array = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 },
                          { 7, 8, -10, -24, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 },
                          { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 },
                          { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, };
        int c = 5;
        System.out.printf("%d\n", arrMin(array, c));

    }

    public static int arrMin(int[][] array, int c) {
        int min = array[0][c];

        for (int k = 0; k < array.length; k++) {
            if(array[k][c]<min){
                min = array[k][c];
            }
            System.out.println("Row " + k + ", Column " + c + "=  " + array[k][c] + ", ");
        }
        return min;
    }
}
