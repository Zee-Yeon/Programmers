class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] a = new int[str.length];
        String b = "";
        
        int min = 0;
        int max = 0;
        
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
            
            if (i == 0) {
                min = a[i];
                max = a[i];
            } else {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}