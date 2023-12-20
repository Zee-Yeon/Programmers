import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] str = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            str[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(str);
        
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].substring(1);
        }
        
        return str;
        
    }
}