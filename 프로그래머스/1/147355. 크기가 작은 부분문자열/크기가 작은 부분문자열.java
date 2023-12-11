class Solution {
    public int solution(String t, String p) {
        /* <런타임 에러 + fail>
        String[] str = t.split("");
        String a = "";
        int count = 0;
        
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                a += str[j];
                if (a.length() == p.length() && Integer.parseInt(a) <= Integer.parseInt(p)) {
                    count++;
                    System.out.println(a);
                    a="";
                    break;
                }
                if (a.length() > p.length()) {
                    a = "";
                    break;
                }
            }
        }
        */

        String c = "";
        int count = 0;
        
        for (int i = 0; i <= t.length()-p.length(); i++) {
            c = t.substring(i, i+p.length());
            
            if (Long.parseLong(c) <= Long.parseLong(p)) {
                count++;
            }
            c = "";
        }
        return count;
    }
}