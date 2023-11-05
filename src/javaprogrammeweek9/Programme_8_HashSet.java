package javaprogrammeweek9;

import java.util.HashSet;

/**
 * 8.	Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_HashSet {
    public static void main(String[] args) {
        //object creation for hashSetNumbers
        Programme_8_HashSet hashSet = new Programme_8_HashSet();
        hashSet.hashSetNumbers();// calling the hashSetNumbers method to main method
    }

    public void hashSetNumbers() {
        // create a HashSet object
        HashSet<Integer> numbers = new HashSet<>();
        //set the value which ask to set 4, 7 and 8
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        // for loop and if else statement
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in set");
            }
        }
    }
}
