import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding 10 elements
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("Orange");
        set.add("Purple");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Brown");

        // Adding an element
        set.add("Gray");

        // Iterating using an Iterator
        System.out.println("HashSet elements:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element
        set.remove("Pink");

        // Checking if an element is present
        System.out.println("Is 'Blue' present? " + set.contains("Blue"));

        // Finding the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

        // Checking if HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing, is HashSet empty? " + set.isEmpty());
    }
}
