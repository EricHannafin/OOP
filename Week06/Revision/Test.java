package Week06.Revision;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        String output = "";

        JTextArea textArea = new JTextArea();
        Font font = new Font("Monospaced", Font.PLAIN,12);
        textArea.setFont(font);
        textArea.setText(String.format("%-25s", "Name"));

        String name = "\n\neric";

        output += (String.format("%-25s", name));

        int question = JOptionPane.showConfirmDialog(null, "Do you like chicken" );

        Random rand = new Random();
        int r = rand.nextInt(50);

        String answer = "";
        if (question == 0){
            answer = "yes";
        }
        else{
            answer = "no";
        }
        output += "\nThe answer to the question was " + answer;
        output += "\nThe random number is " + r;

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Output",JOptionPane.INFORMATION_MESSAGE);

    }

}
