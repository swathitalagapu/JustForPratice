package org.example.TypeCasting;

public class WideningTypeCasting {

        static int d = 100;
        public int myMethod(int a, int b){
            int result =a/b;
            return result;
        }

        public static void main(String args[]){
         WideningTypeCasting wtc = new WideningTypeCasting();
            double i =  wtc.myMethod(34,10);
//            int i = (int) d;
            System.out.println(i);


    }
}
