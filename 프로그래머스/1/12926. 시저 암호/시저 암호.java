class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer += c;
            } else if ('A' <= c && c <= 'Z') {
                if (c + n > 'Z') {
                    answer += (char)(c + n - 26);
                } else {
                    answer += (char)(c + n);
                }
            } else {
                if (c + n > 'z') {
                    answer += (char)(c + n - 26);
                } else {
                    answer += (char)(c + n);
                }
            }
        }
        return answer;
    }
}