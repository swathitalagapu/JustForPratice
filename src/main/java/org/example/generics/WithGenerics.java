package org.example.generics;

import java.util.*;

public class WithGenerics {
    public static void main(String args[]){
        Set<String> set = new LinkedHashSet<>();
//        list.add(1);
        set.add("swathi");
        set.add("tanvi");
        set.add("Apple");
//        list.add(34);
      List<String> list = new ArrayList<>(set);
         String s = list.get(0);
        System.out.println(s);

        for(String str : list)
        System.out.println(str);

    }

}
