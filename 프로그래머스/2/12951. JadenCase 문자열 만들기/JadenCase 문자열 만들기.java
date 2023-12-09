class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String a = "";
        int count = 0;
        
        for (String b : str) {
            if (b.contains(" ")) {
                count = 0;
            } else {
                count++;
            }

            if (count == 1) {
                a += b.toUpperCase();
            } else {
                a += b.toLowerCase();
            }
        }
        
        return a;
        
    }
}