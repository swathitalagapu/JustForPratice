package org.example.methods;


public class SampleMethod {
    public static String grade(int marks) {
        if(marks > 90) {
            System.out.println("A");
            return "A";
        } else if (marks <=90 && marks>=75) {
            System.out.println("B");
            return "B";
        }
        else{
            System.out.println("c");
            return "c";
        }
    }

    public static void main (String args[]) {
        SampleMethod.grade(67);
        SampleMethod.grade(91);
    }

}
