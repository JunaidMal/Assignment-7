/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the radius is then inputted into the function method and the area is stored as "answer" which is then printed out.
        double answer = circleArea(4);
        System.out.println(answer);
    }
    // this function type method takes the radius value

    public static double circleArea(double radius) {
        // the radius is then squared and multiplied by pi then the answer is stored as double "area"
        double area = Math.PI * Math.pow(radius, 2);
        // the area is then returned back to the caller
        return area;
    }
}
