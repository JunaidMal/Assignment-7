/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author malij6756
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        examGrade(80);
    }

    public static void examGrade(int grade) {

        if (grade >= 80) {
            System.out.println("A");
        }

        if (grade >= 70 && grade < 80) {
            System.out.println("B");
        }

        if (grade >= 60 && grade < 70) {
            System.out.println("C");
        }

        if (grade >= 50 && grade < 60) {
            System.out.println("D");
        }

        if (grade < 50) {
            System.out.println("F");
        }

    }
}
