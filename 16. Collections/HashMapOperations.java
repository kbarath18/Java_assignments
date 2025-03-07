import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding 10 key-value pairs
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // Inserting a new key-value pair
        studentMap.put(111, "Kim");

        // Fetching the value of a key
        System.out.println("Value for key 104: " + studentMap.get(104));

        // Creating a clone of the HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);

        // Checking if a key is present
        System.out.println("Is key 103 present? " + studentMap.containsKey(103));

        // Checking if a value is present
        System.out.println("Is value 'Eve' present? " + studentMap.containsValue("Eve"));

        // Checking if the map is empty
        System.out.println("Is HashMap empty? " + studentMap.isEmpty());

        // Printing the size of the HashMap
        System.out.println("Size of the HashMap: " + studentMap.size());

        // Printing all keys
        System.out.println("Keys in the map: " + studentMap.keySet());

        // Printing all values
        System.out.println("Values in the map: " + studentMap.values());

        // Removing a specific key-value pair
        studentMap.remove(105);
        System.out.println("After removing key 105: " + studentMap);

        // Copying all elements to another HashMap
        HashMap<Integer, String> newMap = new HashMap<>(studentMap);
        System.out.println("New copied HashMap: " + newMap);
    }
}
