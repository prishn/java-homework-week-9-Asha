package javaprogrammeweek9;

import java.util.ArrayList;

/**
 * 4.	Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */
public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        // object creation for arrayColourList method
        Programme_4_ColourArrayList colourArrayList = new Programme_4_ColourArrayList();
        colourArrayList.arrayColourList();// calling the arrayColourList method to main method
    }

    public void arrayColourList() {
        // Array list declaration
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Blue");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Red");
        colourList.add("Purple");
        colourList.add("Orange");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("Pink");
        colourList.add("Violet");
        // for each loop
        for (String colourName : colourList) {
            System.out.print(colourName + ", ");
        }
    }
}
