package org.example.polymorphism;

public class MethodOverRiding {

    void hello() {
        System.out.println("a");
    }
}
class hi extends MethodOverRiding {
    void hello() {
        System.out.println("b");
    }

    public static void main (String args[]) {
        hi obj = new hi();
        obj.hello();
    }
}




