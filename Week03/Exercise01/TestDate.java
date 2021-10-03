package Week03.Exercise01;

import javax.swing.*;

public class TestDate {

    public static void main(String[] args) {

        String output = "";
        Date date1 = new Date();

        output += "The result of testing the Date class is as follows:\n\n\n" +
                "Just called the Date() constructor, the value of the first " +
                "Date object is " + date1.toString();

        int day = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value "));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Please enter a month value "));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year value "));

        Date date2 = new Date(day, month, year);

        output += "\n\n\nJust called the Date() constructor, the value of the second " +
        "Date object is " + date2.toString();

        JOptionPane.showMessageDialog(null,output,"Date Class test result",
                                        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
