package firstday.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 4);
        System.out.println("Va: " + map);

        System.out.println("Val: A=" + map.get("A"));
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> element : entries) {
            System.out.println("Key: " + element.getKey() + ", Val: " + element.getValue());
        }

        map.keySet();//A, B
        map.values(); //3, 4

        //Cho mot chuoi: TRONG DAM GI DEP BANG SEN
    }
}
