public class DAY94_scoreOfString {

    // LEETCODE : 3110

    public static void main(String[] args) {
        String s = "tushar";
        System.out.println(scoreOfString(s));
    }
    static int scoreOfString (String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ans += Math.abs (s.charAt(i) - s.charAt(i + 1));
        }
        return ans;
    }
}
