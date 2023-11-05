package javaprogrammeweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9.	Create a HashMap object called people
 * that will store String keys and Integer values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        // object creation for hashMapPeople method
        Programme_9_HashMap hashMap = new Programme_9_HashMap();
        hashMap.hashMapPeople();// calling the hashMapPeople method to main method
    }

    public void hashMapPeople() {
        // create the HashMap object as people
        HashMap<Integer, String> people = new HashMap();
        // add key and value
        people.put(1, "David");
        people.put(2, "Richard");
        people.put(3, "Lisa");
        people.put(4, "Jennifer");
        people.put(5, "David");
        people.put(6, "Shyam");
        people.put(7, "Karen");
        people.put(8, "Emily");

        for (Map.Entry<Integer, String> peopleName : people.entrySet()) {
            System.out.println(peopleName.getKey() + " = " + peopleName.getValue());
        }
    }
}
