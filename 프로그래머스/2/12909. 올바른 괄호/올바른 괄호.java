import java.util.*;

class Solution {
    boolean solution(String s) {
//         String[] a = s.split("");
//         Stack<String> stack = new Stack<>();
        
        
//         if (a.length % 2 != 0) {
//                return false; 
//         }
        
//         for (int i = 0; i < a.length; i++) {         
//             if (a[i].equals("(")) {
//                 stack.push(a[i]); 
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 stack.pop();
//             }
//         }
//         if (!stack.isEmpty()) {
//             return false;
//         }
//         return true;
        
        char[] a = s.toCharArray();
        Stack<Character>stack = new Stack<>();
        
        
        if (a.length % 2 != 0) {
               return false; 
        }
        
        for (int i = 0; i < a.length; i++) {   
            char c = a[i];
            if (c == '(') {
                stack.push(c); 
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;

    
        
        
    }
}