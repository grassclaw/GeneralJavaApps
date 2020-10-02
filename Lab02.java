// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/09/2020
// ASSIGNMENT: Lab02 - Using Variables and User Input
/* PURPOSE: Outputs tax amounts and total purchase price on purchase amount 
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: Scanner utilized for user input
    - named constants --> state and county tax rate
    - int variables to hold amount of purchase price, calculated state and county tax, total cost
*/
/*PROCESSING SECTION
    - Arithmetic to calculate state and county taxes as well as total cost after tax
*/
/*OUTPUTS
    - Output tax amounts and total purchase price with tax.
    -Note: Test cases are: 39.95, 22.50, 10, 1, 0
***********************************************************************************************/
package javaActivities;

import java.util.Scanner;

public class Lab02{

    public static void main(String[] args){
        //% sales tax
        final double STATE_S_TAX = .04; 
        final double COUNTY_S_Tax = .02;
        
        //Currency: USD
        double purchasePrice;
        double calcStateTax;
        double calcCountyTax;
        double sumTotalTax;
        double sumTotalCost;

        //open scanner for user input
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the purchase amount: ");
        purchasePrice = stdin.nextDouble();
        System.out.println();

         //close scanner to prevent memory leak/activate garbage collector
         stdin.close();

        //Processing
        calcStateTax = purchasePrice * STATE_S_TAX;
        calcCountyTax = purchasePrice * COUNTY_S_Tax;
        sumTotalTax = (calcStateTax + calcCountyTax);
        sumTotalCost = sumTotalTax + purchasePrice;

        //Output
        System.out.println("Results calculated based on your input:");
        System.out.println("Purchase amount you entered: $" + purchasePrice);
        System.out.println("State tax: $" + calcStateTax);
        System.out.println("County tax: $" + calcCountyTax);
        System.out.println("Total tax: $"+ sumTotalTax);
        System.out.println("Total cost: $" + sumTotalCost);
        System.out.println();
    } 
}