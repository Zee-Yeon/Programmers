import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
//         List<Integer> list = new ArrayList<>();
//         int[] open = new int[progresses.length];
        
//         for (int i = 0; i < progresses.length; i++) {
//             open[i] = (100 - progresses[i]) / speeds[i];
//             if((100 - progresses[i]) % speeds[i] != 0) {
//                 open[i] += 1;
//             }
//         }
        
//         int x = open[0];
//         int count = 1;
        
//         for (int i = 1; i < open.length; i++) {
//             if (x >= open[i]) {
//                 count++;
//             } else {
//                 list.add(count);
//                 count = 1;
//                 x = open[i];
//             }
//         }
//         list.add(count);
  
//         int[] a = new int[list.size()];
        
//         for(int i = 0; i < list.size(); i++) {
//             a[i] = list.get(i);
//         }
 
//         return a;
        
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {           
            if ((100 - progresses[i]) % speeds[i] != 0) {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            } else {
                queue.add((100 - progresses[i]) / speeds[i]);
            }
        }        
        
        int x = queue.poll();
        int count = 1;
        while(!queue.isEmpty()) {
            if (x >= queue.peek()) {
                count++;
                queue.poll();
            } else {
                list.add(count);
                count = 1;
                x = queue.poll();
            }
        }
        list.add(count);
          
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        
        return a;
    }
    
    
}