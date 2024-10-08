package array01;

import java.util.HashSet;
import java.util.Set;

public class anagram {
    public static boolean  ann(String s,String t){
        
                if (s.length() != t.length()) return false;
        
                int[] store = new int[26];
        
                for (int i = 0; i < s.length(); i++) {
                    store[s.charAt(i) - 'a']++;
                    store[t.charAt(i) - 'a']--;
                }
        
                for (int n : store) if (n != 0) return false;
        
                return true;
            }
        
        
    
    public static void main(String[] args) {
       String s = "racecar" , t="carrace";
      // String s ="jar",t ="jam";
       System.out.println( ann(s,t));
    }
}
