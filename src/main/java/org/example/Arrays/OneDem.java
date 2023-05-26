package org.example.Arrays;

public class OneDem {
    public static void main(String args[]){
        int num[] = new int[5];
        num[0]= 9;
        num[1]=8;
        num[2] = 3;
        num[3] = 5;
        num[4] = 6;
System.out.println("for each loop");
        for(int i : num)
            System.out.println(i);
System.out.println("for loop starts");
        for( int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

}
