import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding 10 elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // Adding an element to the ArrayList
        list.add("Kiwi");

        // Iterating using Iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("ArrayList elements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adding an element at a specific index
        list.add(2, "Blueberry");

        // Removing an element by value
        list.remove("Date");

        // Removing an element by index
        list.remove(4);

        // Updating an element at a specific index
        list.set(5, "Mango");

        // Checking if an element is present at a particular index
        System.out.println("Element at index 3: " + list.get(3));

        // Getting an element at a particular index
        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Finding the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // Checking if a given element is present
        System.out.println("Is 'Apple' in the list? " + list.contains("Apple"));

        // Removing all elements
        list.clear();
        System.out.println("Is ArrayList empty? " + list.isEmpty());
    }
}
