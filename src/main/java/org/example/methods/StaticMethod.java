package org.example.methods;

public class StaticMethod {
    public static int  multiple(int num) {
//        int result;
        return num * num;
//        return result;
    }
    public static void main (String args[]) {
        int result;
       result =  multiple(20);
       System.out.println(result);
       System.out.println("By using static keyword no need to create object for the class");


    }
}
