import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] a = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int one = commands[i][0];
            int two = commands[i][1];
            int three = commands[i][2];
            
            List<Integer> list = new ArrayList<>();
            
            for (int j = one - 1; j < two; j++) {                
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            a[i] = list.get(three - 1);
        }
        
        return a;
    }
}