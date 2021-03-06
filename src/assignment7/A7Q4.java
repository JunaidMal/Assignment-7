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
        // new scanner that's used to get the user's input in principle amount, interest rate, and years
        Scanner input = new Scanner(System.in);
        
        // the user is asked for the Principle amount, the Interest rate, and the number of years then the values given are stored to be used in the method
        System.out.println("Please enter the Principle amount: ");
        double pA = input.nextDouble();
        
        System.out.println("Please enter the Interest rate: ");
        double iR = input.nextDouble();
        
        System.out.println("Please enter the number of years");
        int year = input.nextInt();
        
        // the function method is then used with the principle amount, interest rate, and years compounded yearly
        double filler = compoundInterest(pA, iR, year);
        
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
