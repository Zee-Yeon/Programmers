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
        
        /* Comparator 
      Arrays.sort(strings);
      Arrays.sort(strings, new Comparator<String>(){
          @Override
          public int compare(String s1, String s2){
              if(s1.charAt(n) > s2.charAt(n)) return 1;
              else if(s1.charAt(n) < s2.charAt(n)) return -1;
              else return 0;
          }
      });
      return strings;
      */
        
    }
}