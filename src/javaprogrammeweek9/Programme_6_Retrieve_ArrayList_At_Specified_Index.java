package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6.Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_Retrieve_ArrayList_At_Specified_Index {

    public static void main(String[] args) {

        countryList();// calling the  country list method to main method
    }

    public static void countryList() {
        // Arraylist declaration
        ArrayList<String> europeanCountryList = new ArrayList<>();
        europeanCountryList.add("France");
        europeanCountryList.add("Spain");
        europeanCountryList.add("Greece");
        europeanCountryList.add("Germany");
        europeanCountryList.add("Malta");
        europeanCountryList.add("Italy");
        europeanCountryList.add("United Kingdom");
        europeanCountryList.add("Switzerland");
        europeanCountryList.add("Poland");

        System.out.println(europeanCountryList);// printing array list
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number"); // ask user to enter index number
        int index = scanner.nextInt(); // storing value in integer which enter by user
        // if else statement
        if (index < europeanCountryList.size()) {
            System.out.println(europeanCountryList.get(index));// get method
        } else {
            System.out.println("Invalid Index");// error message
        }
        // closing scanner object
        scanner.close();
    }
}
