//Part b
// PROGRAMMER: Aaron Escamilla
// COURSE: CSC110(JAVA)
// CLASS TIME: 10am
// COMPLETION: 9/03/2020
// ASSIGNMENT: Lab01 - LandCalculation
/* PURPOSE: This applicaiton outputs calculated acreage based on sq. ft. provided
    - Demonstrate variable IPO layout (Input Section Processing Section, Output Section)
*/
/*INPUTS SECTION: All inputs are hardcoded in this assignment
    - named variable to store square feet per acre conversion constant
    - two double variables that hold the square footage and the corresponding number of acres
*/
/*PROCESSING SECTION
    - Arithmetic to calculate the number of acres from provided square footage
*/
/*OUTPUTS
    - String output with corresponding square footage to acres
***********************************************************************************************/
package javaActivities;

public class LandCalculation {
    public static void main (String[] args) {
        //Input - Variable Declaration
        final int SQFT_ACRE = 43560; //(sq.ft/acre)
        double areaSqFt = 389767;
        double areaAcre; 

        //Processing
        //Unit Conversion: (sq.ft)/(acre/sq.ft)-->acre
        areaAcre = areaSqFt / SQFT_ACRE; 

        //Output
        System.out.println("A tract of land with "+areaSqFt+" square feet has "+areaAcre+" acres.");
    }
}