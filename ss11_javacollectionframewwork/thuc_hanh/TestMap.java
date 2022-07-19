package ss11_java_collection_framewwork.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 26);
        hashMap.put("Anderson", 28);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 27);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        hashMap.put("Smith", 26);
        hashMap.put("Anderson", 28);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 27);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
