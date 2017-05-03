/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the procedure type method is used with a number
        allDigitsOdd(3333233);
    }

    // Procedure type method that takes in an integer then checks all it's digits to see if they're all odd
    public static void allDigitsOdd(int numb) {
        // this checker will be used in the end to see if any of the digits were even and if they were, not to print out "true" for all odd digits
        int checker = 0;

        // while the number is longer than 2 digits the loop will divide by 10 to isolate the first digit infront of the decimal
        while (numb > 10) {
            // if the answer to an operator of 2 is 0, then the number is even and if it's 1 then it's odd
            int digitCheck = numb % 2;

            // if the number is even then "false" will be printed and the code will break out of the loop while updating the checker so "true" isn't printed when the checker is later used in a condition
            if (digitCheck == 0) {
                System.out.println("false");
                checker = 1;
                break;
            }
            // the number is divided by 10 each time to check every single digit during the loop by isolating digits behind the decimal
            numb = numb / 10;

        }
        // the checker will equal 0 if all the numbers were odd and if that's the case, "true" will be printed to signal that all digits were odd
        if (checker == 0) {
            System.out.println("true");
        }
    }
}
