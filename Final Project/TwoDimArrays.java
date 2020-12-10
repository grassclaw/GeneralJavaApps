/* 
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
/* 
1. unique3x3 – accepts a 3x3 array of int and returns true if the array contains each of the nine values 1 through 9 exactly once,
otherwise false. There are nine elements in the array, so each value (1..9) must appear in the array exactly once.
 */
public class TwoDimArrays {
    final static int SIDES = 3;
    public static void main(Stringp[] args){
        char testCase = '1';
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

            switch (testCase) {
                case '1':// Extract Evens
                    System.out.printf("Using array m: %s\n", printArray(m));
                    System.out.printf("New array without Evens: %s\n", extractEvens(m));
                    break;
                case '2': // Compress
                    System.out.printf("Using array m: %s\n", printArray(m));
                    System.out.printf("New array without Evens: %s\n", compress(m));
                    break;
                case '3':// Union
                    System.out.printf("Using array n: %s", printArray(m));
                    System.out.printf("Using array m: %s", printArray(n));
                    break;
                case '4':// Shuffle
                    System.out.printf("Using array m: %s", printArray(m));
                    break;
                case '5': // exit
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.print("Please choose a valid option: ");
            }
            // hard to break out of a switch and while
            if (testCase == '5') {
                break;
            }
            System.out.print("Please select which function you would like to test (1-4): ");

        }
        stdin.close();
    }

    //unique3x3 checks the matrix is unique 1-9 valued
    private static boolean unique3x3(int[][] mat3){
        for(int i=0; i<SIDES; i++){
            for(int j=0; j<SIDES; j++){

            }
        }
        return true;
    }

    private static showTable(){

    }

    private int[][] generateTable(){
        return true;
    }
    
    private static findUnique3x3(){

    }


}