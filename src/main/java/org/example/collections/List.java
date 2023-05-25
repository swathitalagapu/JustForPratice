package org.example.collections;

import java.util.ArrayList;

public class List {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("hii");
        obj.add("hello");
        obj.add("Good Afternoon");
        System.out.println(obj);
        obj.add(1, "person");
        System.out.println(obj);

        int number = obj.size();
        System.out.println(number);

        obj.set(1, "bye");
        System.out.println(obj);

        String ret = obj.get(3);
        System.out.println(ret);

        obj.remove("bye");
        System.out.println(obj);
    }
}