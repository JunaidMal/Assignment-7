/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // runs the procedure method "factors" with 10 as the parameter
        factors(10);

    }
    // procedure type method called factors with an integer called "parameter" as the parameter

    public static void factors(int parameter) {

        // this loop runs through every number from 1 to the parameter
        for (int i = 1; i <= parameter; i++) {
            // every number from 1 to the parameter is checked if it leaves a remainder when divided from the parameter
            // if the number leaves no remainders then it's a factor of the parameter and is printed, if not then the loop continues
            if (parameter % i == 0) {
                System.out.print(i + " ");
            }

        }


    }
}
