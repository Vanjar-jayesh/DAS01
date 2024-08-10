package javacodingQuestions.Questions;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Quse 06 
 * write a program to generate random numbers between the given range?
 */
public class Quse_06 {
    public static int getrandomvalue(int min ,int max){
        return ThreadLocalRandom.current().nextInt(min,max + 1);
    }
    public static void main(String[] args) {
        int min = 1,max =100;
        System.out.println("Random value between" + min + "and" + max+ " : "+ " " + getrandomvalue(min, max));
    }
}
