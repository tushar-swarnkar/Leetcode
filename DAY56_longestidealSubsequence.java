public class DAY56_longestidealSubsequence {

    // LEETCODE : 2370
    
    public static void main(String[] args) {
        String s = "acfgbd";
        int k = 2;
        System.out.println(longestIdealString(s, k));
    }
    static int longestIdealString(String s, int k) {
        int res = 0, n = s.length(), dp[] = new int[150];
        for (int ci = 0; ci < n; ++ci) {
            int i = s.charAt(ci);
            for (int j = i - k; j <= i + k; ++j)
                dp[i] = Math.max(dp[i], dp[j]);
            res = Math.max(res, ++dp[i]);
        }
        return res;
    }
}
