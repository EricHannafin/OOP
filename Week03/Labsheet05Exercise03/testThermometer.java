package Week03.Labsheet05Exercise03;

import javax.swing.*;
import java.awt.*;

public class testThermometer {

    public static void main(String[] args) {

        String output = "";
        int currentTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature "));
        Thermometer t1 = new Thermometer(currentTemp);

        output += "Calling the single argument constructor...... setting the temperature of the first thermometer to 35\n"
                + "First Thermometer" + t1.toString();

        Thermometer t2 = new Thermometer();

        output += "\n\n\nCalling the no argument constructor...... setting the temperature of the second thermometer to 0\n"
                + "First Thermometer" + t2.toString();

        t2.setCurrentTemp(25);

        output += "\n\n\nCalling the no argument constructor...... setting the temperature of the second thermometer to 0\n"
                + "First Thermometer" + t2.toString();

        JOptionPane.showMessageDialog(null, output, "Thermometer",
                JOptionPane.INFORMATION_MESSAGE);

        int firstTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the temperature of the first thermometer "));

        t1.setCurrentTemp(firstTemp);


        String output2 = "**********Thermometer testing************\n\n" + t1.toString();

        JOptionPane.showMessageDialog(null, output2, "Thermometer",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
