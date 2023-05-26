package org.example.methods;

public class Exception {
    public  int numbers(int a, int b) throws ArithmeticException {
        int c = a/b;
        return c;
    }
    public static void main (String args[]) {
       Exception s1 = new Exception();
       float num = s1.numbers(30,0);
        System.out.println(num);


    }
}
