package firstday.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("D");
        list.add("C");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("I: " + list.get(i));
        }
        for (String element : list) {
            System.out.println("I2: " + element);
        }
        list.forEach(element -> {
            System.out.println("I3: " + element);
        });
        ///ADD in the middle
        // Add at index
        // Add first
        // add last
        // find
        // delete

        ///Create List
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collections.sort(list);
        System.out.println("Sorted: " + list);
        //Arrays.sort
    }
}
