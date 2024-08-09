package Stac.Stack01;

// import java.util.ArrayDeque;
// import java.util.Deque;
import java.util.Stack;

 import java.util.Scanner;
// import java.util.Stack;

// public class Quse_01 {
//     public static boolean isBalanled(String str){
//         Stack<Character> st = new Stack<>();

//         int n = str.length();
//         for(int i = 0; i<n; i++){
//             char ch = str.charAt(i);

//             if (ch == '('|| ch == '{' || ch == '[') {
//                 st.push(ch);
                
//             }else{
//                 if (st.size() == 0) {
//                     return false;
                    
//                 }
//                 if (st.peek() == '(' || st.peek() == ')' || st.peek() == '{' ||st.peek() == '}'|| st.peek() == '['|| st.peek() == ']') {
                 
//                     st.pop();
                    
//                 }

                
//             }
       
//         }
//         if (st.size()>0) {
//             return false;
//         }
//         else return true;

//      //   return st.isEmpty();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(str);
//         System.out.println(isBalanled(str));
//     }
// }

public class Quse_01 {

    // function to check if brackets are balanced
    static boolean isBalanled(String s)
    {
        // Using ArrayDeque is faster than using Stack class
              Stack<Character> st
            = new Stack<>();
            int n = s.length();

        // Traversing the Expression
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch== '(' || ch == '[' || ch == '{') {
                // Push the element in the stack
                st.push(ch);
                continue;
            }

         
            if (st.isEmpty())
                return false;
            char check;
            switch (ch) {
            case ')':
                check = st.pop();
                if (check == '{' || check == '[')
                    return false;
                break;

            case '}':
                check = st.pop();
                if (check == '(' || check == '[')
                    return false;
                break;

            case ']':
                check = st.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        // Check Empty Stack
        return (st.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
     {
    //     String expr = "([)]";

    //     // Function call
    //     if (areBracketsBalanced(expr))
    //         System.out.println("Balanced ");
    //     else
    //         System.out.println("Not Balanced ");

            
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(isBalanled(str));
    }
}