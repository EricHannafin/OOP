package Week01.Lab01;

import javax.swing.*;

public class CyclistSponsor {

    public static void main(String[] args) {

        final double lowRate = 1.75D;
        final double highRate = 2.50D;


        String name = JOptionPane.showInputDialog("Please enter your name");
        int distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled?"));

        int i = 1;
        double fee1 = 0;
        double sum1 = 0;
        while (i <= 10 && i <= distance && i >= 1) {

            fee1 = +i;
            i++;
            sum1 = fee1 * lowRate;
        }


        i = i -1;                                  // i was always 1 count too high from previous loop
        double remainingDistance = distance - i;

        double sum2 = remainingDistance * highRate;

        double total = sum2 + sum1;


        JOptionPane.showMessageDialog(null, "Name: " + name + "\n" + "Distance: " + distance + "\n" +
                "Fee: €" + total, "Receipt", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}