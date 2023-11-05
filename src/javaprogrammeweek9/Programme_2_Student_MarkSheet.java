package javaprogrammeweek9;

import java.util.Scanner;

/**
 * 2.Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop.
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_2_Student_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name               \t\t:\t");
        String name = scanner.nextLine();
        System.out.print("\nEnter Student Roll Number        \t\t:\t");
        int rollNumber = scanner.nextInt();

        // while loop for maths marks
        System.out.print("\nEnter Marks of Maths Subject        \t:\t");
        int mathsMarks = scanner.nextInt();

        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Marks should be between 1 to 100");
            System.out.print("\nPlease enter correct marks   \t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        // while loop for science marks
        System.out.print("\nEnter Marks for Science Subject     \t:\t");
        int scienceMarks = scanner.nextInt();

        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("\nInvalid input, Marks should be between 1 to 100");
            System.out.print("\nPlease enter correct marks   \t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        // while loop for english marks
        System.out.print("\nEnter Marks for English Subject     \t:\t");
        int englishMarks = scanner.nextInt();

        while (englishMarks < 0 || englishMarks > 100) {
            System.out.print("\nInvalid input, Marks should be between 1 to 100");
            System.out.print("\nPlease enter correct marks   \t\t:\t");
            englishMarks = scanner.nextInt();
        }
        //calculating total of three subjects
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNumber, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //closing the scanner object
        scanner.close();
    }

    // calculating the sum of three subjects
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculation the result on subjects marks like pass or fail
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }

    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("PASS")) {
            if (percentage >= 100) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage > +35) {
                grade = "C";
            } else {
                grade = "-";
            }
        }
        return grade;
    }

    // Printing the MarkSheet
    public static void printTheMarkSheet(String name, int rollNumber, int mathsMarks, int scienceMarks, int englishMarks,
                                         double total, double percentage, String result, String grade) {
        System.out.println("_____________________________________________|");
        System.out.println("|                                            |");
        System.out.println("| MarkSheet                                  |");
        System.out.println("|____________________________________________|");
        System.out.println("| Name: " + name + "                                 |");
        System.out.println("| Roll Number: " + rollNumber + "                            |");
        System.out.println("|____________________________________________|");
        System.out.println("| Subjects: Marks                            |");
        System.out.println("|____________________________________________|");
        System.out.println("| Maths: " + mathsMarks + "                                  |");
        System.out.println("| Science: " + scienceMarks + "                                |");
        System.out.println("| English: " + englishMarks + "                                |");
        System.out.println("|____________________________________________|");
        System.out.println("| Total: " + total + "                               |");
        System.out.println("|____________________________________________|");
        System.out.println("| Percentage: " + percentage + "                           |");
        System.out.println("| Result: " + result + "                               |");
        System.out.println("| Grade: " + grade + "                                   |");
        System.out.println("|____________________________________________|");
    }
}
