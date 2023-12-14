import java.util.*;

class Solution {
    // replaceAll => StringPool 안에서 찾아보고 없으면 새로 만듦, 연산 속도가 오래걸림
    // String, immutable class 
    
    int[] answer;
    public int[] solution(String s) {
        answer = new int[2];
        toBinary(s);
        return answer;
    }
    
    void toBinary(String s) {
        if (s.equals("1")) return;
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, "0");
        while (st.hasMoreElements()) {
            sb.append(st.nextToken());
        }
        
        answer[0]++;
        answer[1] += s.length() - sb.length();
        
        toBinary(Integer.toBinaryString(sb.length()));
    }
}