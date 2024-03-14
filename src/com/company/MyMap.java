package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Jhon", 1000);
        map.put("Pol", 1000);
        map.put("Mike", 8888);
        map.put("Dan", 1000);
        map.put("Steve", 1000);
        map.put("Sarah", 1000);

        System.out.println(map);

        // System.out.println(map.get("Jhon"));
        // System.out.println(map.get("Pol"));
        // System.out.println(map.get("Mike"));
        // System.out.println(map.get("Dan"));
        // System.out.println(map.get("Steve"));
        // System.out.println(map.get("Sarah"));

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(map.get(k));
        }

    }

}
