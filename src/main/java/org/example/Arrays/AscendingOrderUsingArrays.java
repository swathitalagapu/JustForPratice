package org.example.Arrays;

public class AscendingOrderUsingArrays {
    public static void main(String args[]){
         int[] num = {58, 93,58,02,12};
         for(int i : num) {
             System.out.println(i);
         }
       int temp = 0;
         for(int i=0; i<num.length;i++){
             for(int j=i+1;j<num.length;j++) {
                 if(num[i] > num[j]){
                     temp = num[i];
                     num[i] = num[j];
                     num[j] = temp;
                 }
                 System.out.println("");

             }

         }
        for( int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}
