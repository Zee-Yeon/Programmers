import java.util.*;

class Solution{
    public int solution(String s) {
        
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        // push()을 하는 경우 
        // 1. 비어있을 때
        // 2. peek() 과 넣을 원소가 다를 때 (stack이 비어있을 때는 peek() 불가능)
        
        for (int i = 0; i < c.length; i++) {
            if (!stack.isEmpty() && stack.peek() == c[i]) {
                stack.pop();
            } else {
                stack.push(c[i]);
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
        
        
    }
}