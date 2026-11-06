package lessons.Hcollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
    
    // collections and generics:

    // list - items in a sequence access by position. Arraylist
    // set - distinct items. 
    // map - i want fast lookup with a key. hashmap
    // queue - FIFO dequeue 

    // array drawbacks - fixed size + no methods.

    // Collections is a framework. 
    // characteristics:
    // generics
    // dynamic sizing
    // flexiblitity. 
    
    // ArrayList list = new ArrayList();

    // list.add(123);
    // list.add("one, two, three"); // allowed but unsafe.

    // ArrayList<String> list = new ArrayList<>();
    // list.add("a");
    // list.add(10); // this is not allowed!!

    // List<String> food = new ArrayList<>();

    // food.add("apple");
    // food.add("bread");
    // food.add("apadta");

    // System.out.println(food);
    // System.out.println(food.get(0));

    // System.out.println(food.remove(1));
    // food.set(0, "orange");

    // System.out.println(food.size());
    // System.out.println(food);
    // Collections.sort(food);
    // System.out.println("sorted " + food);

    // List<Integer> numbers = List.of(20, 20, 30, 20);

    //dequeue:

    // Deque<Integer> deque = new ArrayDeque<>();

    // deque.addFirst(1);
    // deque.addLast(2);

    // deque.offerFirst(3);
    // deque.offerLast(4); // use when capacity is limited.

    // System.out.println(deque);

    // deque.removeFirst();
    // deque.removeLast();
    // deque.pollFirst();
    // deque.pollLast(); // returns null if empty.

    // deque.peekFirst(); // looks at the first element without removing it.
                   // returns null if empty.

    // hashmap:

    // Map<String, Integer> map = new HashMap<>();

    // map.put("apple", 1);
    // map.put("banana", 2);
    // map.put("orange", 3); // add or replace

    // System.out.println(map.get("banana")); // 2

    // map.put("apple", 4); // replace value for key "apple"
    // map.putIfAbsent("apple", 100);
    // System.out.println(map.get("apple"));

    // map.getOrDefault("grape", 0); // returns 0 if key not found.

    // System.out.println(map.keySet());
    // System.out.println(map.values());

    // for (Map.Entry<String, Integer> entry : map.entrySet()){
    //     System.out.println(entry.getKey() + " : " + entry.getValue());
    // }
        runDemo(1_0000);
        runDemo(50_0000);

    }





    private static void runDemo(int numberOfStudents) {
        ArrayList<Integer> studentIds = new ArrayList<>();
        HashMap<Integer, String> studentsById = new HashMap<>();

        for (int id = 0; id < numberOfStudents; id++) {
            studentIds.add(id);
            studentsById.put(id, "Student " + id);
        }

        // Prepare the same mix of existing and missing IDs for both searches.
        Random random = new Random(42);
        Integer[] idsToFind = new Integer[4_000];
        for (int i = 0; i < idsToFind.length; i++) {
            idsToFind[i] = random.nextInt(numberOfStudents * 2);
        }

        // Warm up both lookup methods before timing them.
        countListMatches(studentIds, idsToFind);
        countMapMatches(studentsById, idsToFind);

        long start = System.nanoTime();
        int listMatches = countListMatches(studentIds, idsToFind);
        long listTime = System.nanoTime() - start;

        start = System.nanoTime();
        int mapMatches = countMapMatches(studentsById, idsToFind);
        long mapTime = System.nanoTime() - start;

        System.out.printf("%,d students, %,d lookups%n", numberOfStudents, idsToFind.length);
        System.out.printf("  ArrayList.contains:  %8.3f ms (%,d found)%n",
                listTime / 1_000_000.0, listMatches);
        System.out.printf("  HashMap.containsKey: %8.3f ms (%,d found)%n%n",
                mapTime / 1_000_000.0, mapMatches);
    }

    private static int countListMatches(ArrayList<Integer> studentIds, Integer[] idsToFind) {
        int matches = 0;
        for (Integer id : idsToFind) {
            if (studentIds.contains(id)) {
                matches++;
            }
        }
        return matches;
    }

    private static int countMapMatches(HashMap<Integer, String> studentsById, Integer[] idsToFind) {
        int matches = 0;
        for (Integer id : idsToFind) {
            if (studentsById.containsKey(id)) {
                matches++;
            }
        }
        return matches;
    }
}




