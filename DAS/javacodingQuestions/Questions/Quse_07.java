// package javacodingQuestions.Questions;

/**
 * Quse_07
 * write a java program to swap two string variables withot using temp variable?
 */
public class Quse_07 {
    public static void main(String[] args) {
        
        String a = "hello";
        String b = "world";


        System.out.println("String before swap: "+a + " :and:  "+b);

        a =  a+b;
        b = a.substring(0,a.length() - b.length());
        a= a.substring(b.length());
       
        System.out.println("String after swap: a = "+ a + "  and b "+b);



    }

    
}
