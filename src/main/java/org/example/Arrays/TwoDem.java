package org.example.Arrays;

public class TwoDem {
    public static void main(String args[]){
        int[][] num = {{1,2,3},{0,3,5}};
        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(num[i][j]+"  ");

            }
            System.out.println();
        }

    }
}
