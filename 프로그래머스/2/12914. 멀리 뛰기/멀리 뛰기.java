class Solution {
    Long[] arr;
    public long solution(int n) {
        // 1 2 3 5 8 13 21 34 55
        
        // DP - bottom up
        
//         long[] arr = new long[n+1];
//         arr[1] = 1;
//         if (n >= 2) {
//             arr[2] = 2;
//         }
        
//         for (int i = 3; i <= n; i++) {
//             arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
//         }
        
//         return arr[n];
        arr = new Long[n+1];
        return topDown(n);
    }
    
    long topDown(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        if (arr[n] == null) {
            return arr[n] = (topDown(n-2) + topDown(n-1)) % 1234567;
        } else {
            return arr[n];
        }
    }
}