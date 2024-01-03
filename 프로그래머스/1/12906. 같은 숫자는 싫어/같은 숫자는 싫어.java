import java.util.*;

public class Solution {
    public int[] solution(int []arr) { 
        Stack<Integer> stack = new Stack<>();
        
        // 넣을 수 있는 경우 
        // 1. 스택이 비어있을 때, 원소가 같지 않을 때
        
        for (int i = 0; i < arr.length; i++) {
            // if (i == 0) {
            //     stack.push(arr[i]);
            // }
            // if (arr[i] != stack.peek()) {
            //     stack.push(arr[i]);
            // } else {
            //     continue;
            // }
            
            if (stack.size() == 0 || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] a = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) {
            a[i] = stack.pop();
        }

        return a;
    }
}