/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the procedure method is used with 5 set as the parameter
        chaotic(5);

    }
    // this procedure type method will take a parameter then print a random number of asterisks between 1 and 5. The number of lines will be the parameter

    public static void chaotic(int parameter) {

        // this loop limits the number of lines of "*"'s that will be printed
        for (int i = 0; i < parameter; i++) {
            // this randomizer's output is limited between 1 and 5
            int randNumb = (int) (Math.random() * (5 - 1 + 1)) + 1;

            // this loop prints the "*"'s out while limiting the amount to the output from the randomizer
            for (int x = 0; x < randNumb; x++) {
                System.out.print("*");
            }
            // creates a new line for the next line of "*"'s
            System.out.println();
        }
    }
}
