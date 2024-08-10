package javacodingQuestions.Questions;

import java.util.Scanner;

/**
 * Quse_05
 * Find the missing number in an array?
 */
public class Quse_05 {

    public static void main(String[] args) {
        int total;
       int [] arr = new int[]{1,2,3,4,6,7};
       total = 7;
       int ex = total *((total+1)/2);
       int sum =0;
       
       for(int i :arr){
            sum += i;
       }

       System.out.println(ex - sum);
    }
}
