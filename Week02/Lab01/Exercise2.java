package Week02.Lab01;

import javax.swing.*;

public class Exercise2 {

    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Please enter an octet value ");
        isOctetValid(value);

        if(isOctetValid(value)){
            JOptionPane.showMessageDialog(null, "You entered a valid octet",
                    "Octet validation result", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "You entered an invalid octet",
                    "Octet validation result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static boolean isOctetValid(String value) {
        if (value.length() > 0 && value.length() < 4 && !value.equals("256") && value.matches("[0-256]+")) {
            return true;
        } else
            return false;

    }
}
