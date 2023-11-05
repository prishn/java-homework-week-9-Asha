package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 5.Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5_ArrayListWithIterator {

    public static void main(String[] args) {
        //object creation for planet list method
        Programme_5_ArrayListWithIterator obj = new Programme_5_ArrayListWithIterator();
        obj.setPlanetList();// calling the setPlanetList method to main method
    }

    public void setPlanetList() {
        // Arraylist declaration
        ArrayList<String> planetList = new ArrayList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Uranus");
        planetList.add("Neptune");
        // use while loop with iterator
        ListIterator<String> iterator = planetList.listIterator();
        while (iterator.hasNext()) {
            String planet = iterator.next();
            System.out.print(planet + ", ");
            //System.out.print(iterator.next() + ", ");
        }
    }
}
