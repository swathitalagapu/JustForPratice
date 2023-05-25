package org.example.collections;
import  java.util.*;
public class MapCollection {
    public static void main (String args[]) {
        Map<String, Integer> obj = new HashMap<>();
        obj.put("hi", 1);
        obj.put("hello",2);
        obj.put("bye",3);

//        System.out.println(obj);
        for (Map.Entry<String, Integer> hm : obj.entrySet())

                System.out.println(hm.getKey()+ ":"+ hm.getValue());

    }
}