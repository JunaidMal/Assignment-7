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

        // the examGrade method is used with the grade of %80
        examGrade(80);
    }

    public static void examGrade(int grade) {
// grades %80 and above are A
        if (grade >= 80) {
            System.out.println("A");
        }
// grades between %70 and %79 are B
        if (grade >= 70 && grade < 80) {
            System.out.println("B");
        }
// grades between %60 and %69 are C
        if (grade >= 60 && grade < 70) {
            System.out.println("C");
        }
// grades between %50 and %59 are D
        if (grade >= 50 && grade < 60) {
            System.out.println("D");
        }
// grades below %50 are F
        if (grade < 50) {
            System.out.println("F");
        }

    }
}
