import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int temp = 0;
        int max1 = 0;
        int max2 = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > max1) {
                max1 = sizes[i][0];
            }
            if (sizes[i][1] > max2) {
                max2 = sizes[i][1];
            }
        } 
        
        return max1 * max2;
        
        /*
        int length = 0, height = 0;
        
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        
        int answer = length * height;
        
        return answer;
        */
    }
}