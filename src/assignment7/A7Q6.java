/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // the function method is used with a negative integer
        int s = lastDigit(-865);

        // if the final digit is shown as a negative, it's multiplied by -1 to make it positive
        if (s < 0) {
            s = s * -1;
        }
        // the final digit is outputted to the user
        System.out.println(s);
    }

    // Function type method that takes an integer then uses an operator to find the remainder which is the last digit
    public static int lastDigit(int numb) {

        // the parameter is used with an operator of 10 to find the remainder that is returned because it's the last digit
        numb = numb % 10;
        return numb;

    }
}
