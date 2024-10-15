public class DAY230_separateBlackWthite {

    public long minimumSteps(String s) {

        long cnt = 0, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += cnt;
            } else {
                cnt++;
            }
        }
        return ans;
    }

}