package javaprogrammeweek9;

import java.util.Arrays;

/**
 * 3.Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArrayInteger {
    public static void main(String[] args) {
        int[] array = new int[]{20, 30, 40, 50, 60, 70, 80}; // single dimensional array
        System.out.println("Original array: " + Arrays.toString(array));
        // object creation for method reverseAnArrayInteger
        Programme_3_ReverseArrayInteger obj = new Programme_3_ReverseArrayInteger();
        System.out.print("Reverse Array: "); // printing the reverse array
        obj.reverseAnArrayInteger(array); // calling the method to main method
    }

    // method to reverse the array list for single dimensional
    public void reverseAnArrayInteger(int[] arrayList) {
        // for loop for the array to reverse it
        for (int i = 0; i < (arrayList.length) / 2; i++) {
            int a = arrayList[i];
            arrayList[i] = arrayList[arrayList.length - 1 - i];
            arrayList[arrayList.length - 1 - i] = a;
        }// print the reverse array
        System.out.println(Arrays.toString(arrayList));
    }
}
