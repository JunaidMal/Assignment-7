/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the firstDigit function method is tested using a negative integer
        int first = firstDigit(-763053);

        // the first digit is printed to the user
        System.out.println(first);

    }
    // this function type method finds the first digit of an integer then returns it

    public static int firstDigit(int numb) {
        // all negative integers are made positive by multiplying them by -1
        if (numb < 0) {
            numb = numb * -1;
        }
        // while the number is longer than 2 digits the loop will divide by 10 to isolate the first digit infront of the decimal
        while (numb > 10) {
            numb = numb / 10;
        }
        // once the first digit is found then it's returned
        return numb;
    }
}
