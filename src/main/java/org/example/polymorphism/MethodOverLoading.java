package org.example.polymorphism;

public class MethodOverLoading {
    public int sum(int a, int b){
        return a+b;
    }

    public static double sum(double p , double q, double r) {
        return p/q/r;
    }

    public static void main (String args[]) {

        MethodOverLoading obj = new MethodOverLoading();
        System.out.println(obj.sum(45,90));
       double result = sum(90, 98,34);
        System.out.println(result);
    }
}

