package Week01.Lab01;

//Exercise1.java
/*This program calculates the roots of a quadratic and displays them along with their type*/

import javax.swing.*;

public class QuadEquation {
    public static void main(String[] args) {
        int a, b, c, determinant;
        String banner = "****Calcualting the values and types of the roots of a quadratic" +
                " equation****\n\n\nThe quatratic equation has the form ax^2 + bx + c = 0" +
                "\n\n\n";
        String rootTypesAndValues = "";
        double x, y;

        a = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer" +
                " coefficient a"));

        b = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer" +
                " coefficient b"));

        c = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer" +
                " coefficient c"));

        determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            //calculate root1 and root2 and then "build" up the rootTypesAndValues variable

            determinant = -b + (b * b - 4 * a * c) / (2 * a);

        } else if (determinant == 0) {
            //calculate root1 and root2 and then "build" up the rootTypesAndValues variable

        } else {
            //calculate values for x and y
            x = -b / 2 * a;
            y = -1 * b * b - 4 * a * c / 2;

        }


        JOptionPane.showMessageDialog(null, "The quadratic equation has xxxxxx. The" +
                        " value of the determinant is " + determinant + a + b,
                "Roots & Types", JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
    }
}