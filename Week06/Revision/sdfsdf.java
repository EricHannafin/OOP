package Week06.Revision;

import javax.swing.*;
import java.awt.*;

public class sdfsdf {
    public static void main(String[] args) {
        String output = "";
        JTextArea textArea = new JTextArea();
        Font font = new Font("Monospaced", Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s", "Name"));

        String name = JOptionPane.showInputDialog("What is your name ");

        output += String.format("\n\n%-25s", name);

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Title",JOptionPane.INFORMATION_MESSAGE);



    }

}
