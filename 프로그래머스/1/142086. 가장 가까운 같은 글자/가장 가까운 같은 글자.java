class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] a = new int[str.length];
        int num = 0;
        
        a[0] = -1;
        
        for (int i = 1; i < str.length; i++) {
            num++;
            for (int j = i-1; j >= 0; j--) {    
                if (str[i].equals(str[j])) {
                    a[num] = i-j;
                    break;
                } else {
                    a[num] = -1;
                }
            }
        }
        
        return a;
    }
}