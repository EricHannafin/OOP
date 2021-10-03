package Week02.Exercise03.Book;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        String output = "";

        Book b1 = new Book();

        output += "Calling the first no argument constructor \n\n" + b1.toString();

        Book b2 = new Book("First Book", 19.99, "4535355", 654);

        output += "\n\nCalling the multi-argument constructor \n\n" + b2.toString();



        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);



    }

}
