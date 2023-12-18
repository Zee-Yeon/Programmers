import java.util.*;

class Solution {
    public String solution(int[] food) {
        int[] a = new int[food.length];
        String[] s = new String[food.length];
        String answer = "";
        
        // index(=>String) * [0, 3, 0, 1] 원소 / 2 배열(=>int)
        for (int i = 0; i < food.length; i++) {
            s[i] = String.valueOf(i);
            if (food[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = food[i] / 2;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                continue;
            } else {
                answer += s[i].repeat(a[i]);
            }
        }
        
        answer += "0";
        
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] == 0) {
                continue;
            } else {
                answer += s[i].repeat(a[i]);
            }
        }
        
        
        return answer;
    }
}