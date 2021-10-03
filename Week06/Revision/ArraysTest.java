package Week06.Revision;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        int[] numbers = {34,6,10,55,9,44,65,23};
        int x = 54;

        int avg = average(numbers);
        int largest = largestNum(numbers);
        int smallest = smallestNum(numbers);

        System.out.println("\nThe average of those numbers is " + avg);
        System.out.println("\nThe largest of those numbers is " + largest);
        System.out.println("\nThe smallest of those numbers is " + smallest);

        int search = linearSearch(numbers,x);
        if(search == -1){
            System.out.println("\nThe number does not exist");
        }
        else
        {
            System.out.println("\nThe number you are searching for is at index " + search);
        }

        System.out.println("\nThis is the array contents before sort " + Arrays.toString(numbers));
        arraySort(numbers);
        System.out.println("\nThis is the array contents after sort " + Arrays.toString(numbers));






    }

    public static int average(int[] nums){
        int avg = 0, arrayTotal = 0;
        for (int i = 0; i<nums.length; i++){

            arrayTotal += nums[i];
            avg = arrayTotal/nums.length;
            return avg;
        }

        return -1;

    }

    public static int largestNum(int[] nums){
        int largest = nums[0];

        for(int i = 0; i<nums.length; i++){

            if(nums[i] > largest){
                largest = nums[i];
                return largest;
            }
        }

        return -1;
    }

    public static int smallestNum(int[] nums){
        int smallest = nums[0];

        for(int i = 0; i<nums.length; i++){

            if(nums[i] < smallest){
                smallest = nums[i];
                return smallest;
            }
        }

        return -1;
    }

    public static int linearSearch(int[] nums, int x){

        for(int i = 0; i<nums.length; i++){

            if(nums[i] == x){
                return i;
            }
        }

     return -1;
    }

    public static void arraySort(int[] nums){

        for (int i = 0; i < nums.length; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < nums.length; j++)
                if (nums[j] < nums[min])
                    min = j;

            // Swap the found minimum element with the first
            // element
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

    }

}
