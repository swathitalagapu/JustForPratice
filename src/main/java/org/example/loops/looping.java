package org.example.loops;

import java.util.*;

public class looping {
    public static void main(String args[]) {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println(i + "  ");
        }

        System.out.println("For each loop starts");
        List<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        for (Integer hi : obj)
            System.out.println(hi);

        System.out.println("while loop");
    }
}
