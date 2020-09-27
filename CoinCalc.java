 //part C
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/03/2020
// ASSIGNMENT: Lab01c - CoinCalc
/* PURPOSE: Outputs amount of cents for a given amount
    - Also provides optimized combinations of coins
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: All inputs are hardcoded in this assignment
    - named constants --> amount of cents, value to quarters, dimes, and nickels in cents
    - int variables to hold amount of quarter/dime/nickel/penny , total coins, and cents being processed
*/
/*PROCESSING SECTION
    - Arithmetic to calculate the number of each coin needed 
*/
/*OUTPUTS
    - Output formatted list of coins needed for given total.
    -Note: Test cases are cent values: 32, 49, 8
***********************************************************************************************/
package Lab01;

public class CoinCalc {
    public static void main (String[] args){
        //Values of coins in cents
        final int QTR_VAL = 25;
        final int DIME_VAL = 10;
        final int NICKEL_VAL = 5;

        //calculated
        int qtrNum;
        int dimeNum;
        int nickelNum;
        int pennyNum;
        int numCoins;
        int centTotal = 8; //<--Change total change calculated
        

        //Integer division and modulus logic to deduct value
        //Doing pennies first rounds off the number
        pennyNum = centTotal % NICKEL_VAL;

        //subtract running total values of coins for each step and divide by value to get coin amount
        qtrNum = ((centTotal - pennyNum) - ((centTotal - pennyNum) % QTR_VAL)) / QTR_VAL; 

        //doing nickel before quarter rounds the number again to be in tens
        nickelNum = ((centTotal - pennyNum - (qtrNum * QTR_VAL)) % DIME_VAL) / NICKEL_VAL;
       
        dimeNum = (centTotal - pennyNum - (nickelNum * NICKEL_VAL) - (qtrNum * QTR_VAL)) / DIME_VAL;
   

        //calculate total number of coints
        numCoins = qtrNum + dimeNum + nickelNum + pennyNum;

        //output statements
        System.out.println();
        System.out.println("I will tell you the fewest coins needed to make: " + centTotal + " cents.");
        System.out.println();
        System.out.println("You will need " + numCoins + " coins to make " + centTotal + " cents:");
        System.out.println("   Quarters: " + qtrNum);
        System.out.println("      Dimes: " + dimeNum);
        System.out.println("    Nickels: " + nickelNum);
        System.out.println("    Pennies: " + pennyNum);
        System.out.println();

    }
}