package Week01.Lab01;
//SnackDealJava
import javax.swing.*;

public class SnackDead {

    public static void  main(String[] args){

        String name = "";
        String course = "";
        int numOfSnack = 0;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course name");
        numOfSnack = Integer.parseInt (JOptionPane.showInputDialog("How many snacks do you want?"));
        int cost = numOfSnack * 2;


        JOptionPane.showMessageDialog(null, "Name: " +  name + "\n" + "Course: " + course + "\n" +
                "Snacks: " + numOfSnack + "\n" + "Cost: €" + cost, "Receipt",JOptionPane.INFORMATION_MESSAGE);



        System.exit(0);


    }
}
