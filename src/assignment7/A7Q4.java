/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the function method is then used with 1000 principle amount, 1.5% interest rate, over 2 years compounded yearly
        double filler = compoundInterest(1000, 1.5, 2);
        // it's then printed
        System.out.println(filler);
    }
    // function type method that takes the double initial principle, double interest rate, and integer time in years as parameters

    public static double compoundInterest(double initialPr, double intRate, int years) {

        // the interest rate + 1 to the power of the # of years is calculated then multiplied by the initial principal to get the compound interest
        double comp = initialPr * Math.pow((1 + intRate), years);
        // the compound interest is then the value returned
        return comp;

    }
}
