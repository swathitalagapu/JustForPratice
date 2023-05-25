package org.example.methods;

public class MethodPractice {
    public  int addNumbers(int a, int b) {
        int c;
        c= a+b ;
        return c;
    }
    public static void main(String args[]) {
        MethodPractice mp = new MethodPractice();
        int res = mp.addNumbers(10,10);
        System.out.println(res);
    }
}
