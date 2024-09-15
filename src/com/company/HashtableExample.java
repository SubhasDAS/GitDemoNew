package com.company;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a new hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Add some key-value pairs to the hashtable
        ht.put("John", 25);
        ht.put("Jane", 30);
        ht.put("Bob", 42);
        ht.put("Jane", 99);
        // Get the value associated with a key
        int age = ht.get("Jane");
        System.out.println("Jane's age is " + age);

        // Remove a key-value pair from the hashtable
        ht.remove("Bob");

        // Check if a key exists in the hashtable
        boolean hasJohn = ht.containsKey("John");
        System.out.println("Hashtable contains John? " + hasJohn);

        // Print all the key-value pairs in the hashtable
        for (String key : ht.keySet()) {
            int value = ht.get(key);
            System.out.println(key + " is " + value + " years old");
        }
    }
}
