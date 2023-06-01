package org.example.TypeCasting;

public class NarrowingTypeCasting {
//    public static void main(String args[]){
       static int d = 100;
        public int myMethod(int a, int b){
           int result =a/b;
            return result;
    }

    public static void main(String args[]){
            NarrowingTypeCasting wtc = new NarrowingTypeCasting();
        double i = (double)  wtc.myMethod(34,10);
//            int i = (int) d;
            System.out.println(i);

    }
}