package com.green.javaHome.sty.study_one.collections_framework.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        HashMap map = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                int value = (int) map.get(data[i]);
                map.put(data[i], value + 1);
            } else {
                map.put(data[i], 1);
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = (int) entry.getValue();
//            System.out.println(entry.getKey()+" : " + printBar('*',value)+ " "+ value);
            System.out.print(entry.getKey() + " : ");
            for (int i = 0; i < value; i++) {
                System.out.print('*');
            }
            System.out.println(" " + value);
        }

    }
}
