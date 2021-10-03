package Week02.Lab01;

import javax.swing.*;

public class Exercise4 {

    public static void main(String[] args) {

        double[] valueArray = new double[]{22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};
        double max = findLargest(valueArray);
        double average = findAverage(valueArray);
        String aboveAverage = findAboveAverage(valueArray, average);

        JOptionPane.showMessageDialog(null, " The largest value in the array is "
                        + max + " \n The average value in the array " + String.format("%.3f", average) +
                        " \n The list of values above the average is " + aboveAverage,
                "Array Stats", JOptionPane.INFORMATION_MESSAGE);


    }

    public static double findLargest(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static double findAverage(double[] array2) {
        double sum = 0, average = 0;
        for (int i = 0; i < array2.length; i++)
            sum += array2[i];
        average = sum / array2.length;


        return average;
    }

    private static String findAboveAverage(double[] array3, double average) {
        String aboveAverage = "";
        for (int i = 0; i < array3.length; i++) {

            if (array3[i] > average) {

                aboveAverage += array3[i] + " ";
            }

        }

        return aboveAverage;
    }


}
