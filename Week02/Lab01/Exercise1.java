package Week02.Lab01;

import javax.swing.*;
import java.lang.Math;

public class Exercise1 {

    public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the first side of the triangle"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the second side of the triangle"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the third side of the triangle"));

        triangleDetails(a, b, c);

    }

    public static void triangleDetails(double sideA, double sideB, double sideC) {
        String category = "";
        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

        if (sideA == sideB && sideA == sideC)
            category = "equilateral";
        else if (sideA == sideB && sideA != sideC ||
                sideA == sideC && sideA != sideB ||
                sideB == sideC && sideB != sideA)
            category = "isosceles";
        else
            category = "scalene";

        //System.out.println("test " + s);
        JOptionPane.showMessageDialog(null, "The area is " + String.format("%.3f", area) +
                " squared units and the type of triangle is " + category, "Triangle Details", JOptionPane.INFORMATION_MESSAGE);

    }


}
