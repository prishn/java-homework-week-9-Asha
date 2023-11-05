package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        String result; // Storing result in string
        // do-while loop
        do {
            System.out.println("Enter first number: ");// Ask user to enter first number
            int a = scanner.nextInt();// storing value in integer which enter by user
            System.out.println("Enter second number: ");// ask user to enter second number
            int b = scanner.nextInt();// storing value in integer which enter by user
            System.out.println("Please enter one symbol +, -, *, /: ");//Ask user to enter symbol
            char symbol = scanner.next().charAt(0);// storing symbol into char which enter by user
            Calculator obj = new Calculator();// object creation for Calculator method
            obj.calculateResult(a, b, symbol); // calling the calculator method
            // ask user that they want to perform another operation
            System.out.println("Would you like to do more calculation please enter yes for 'y' or no for 'n': ");
            result = scanner.next().toLowerCase();// converting yes or no into lowercase
        }
        while (result.startsWith("y")); // condition for yes or no
        scanner.close();// closing scanner object
    }
}
