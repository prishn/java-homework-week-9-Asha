package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 7.	Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListEmpty {
    public static void main(String[] args) {
        // scanner declaration to read the input from console
        Scanner scanner = new Scanner(System.in);
        Programme_7_ArrayListEmpty obj = new Programme_7_ArrayListEmpty(); // object creation for method
        int size = obj.isEmpty(0);
        System.out.println("The arraylist size is " + size); // printing arraylist size first
        // ask user to enter the index number to see is it empty or not?
        System.out.println("Enter the index number to check if the element in the arraylist is empty or not:");
        int index = scanner.nextInt(); // storing the value in integer which enter by user
        scanner.close(); // closing the scanner object
        obj.isEmpty(index); // calling the method into the main method
    }

    // creating new method for is it empty the arraylist or not
    public int isEmpty(int index) {
        ArrayList<String> bankList = new ArrayList<>();
        bankList.add("Barclays");// 0 index number
        bankList.add("Halifax");
        bankList.add("Lloyds");
        bankList.add("");
        bankList.add("Santander");
        bankList.add("Revolut");
        bankList.add("");
        bankList.add("Nationwide");
        bankList.add("Monzo");
        bankList.add("Metro");
        bankList.add("");
        bankList.add("Natwest");
        bankList.add("Starling"); // 12 index number
        // if else statement
        if (index >= 0 && index < bankList.size()) {
            String element = bankList.get(index);
            if (element == null || element.isEmpty()) {
                System.out.println("The element at index " + index + " is empty.");
            } else {
                System.out.println("The element at index " + index + " is not empty.");
            }
        } else {
            System.out.println("Invalid index number, please enter valid index within the arraylist size");
        }
        return bankList.size();
    }
}

