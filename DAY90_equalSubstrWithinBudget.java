public class DAY90_equalSubstrWithinBudget {
    public static void main(String[] args) {

    }

    static int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            int asciiS = s.charAt(i);
            int asciiT = t.charAt(i);
            diff[i] = Math.abs(asciiS - asciiT);
        }

        int maxLen = 0;
        int curCost = 0;
        int start = 0;

        for (int end = 0; end < diff.length; ++end) {
            curCost += diff[end];
            while (curCost > maxCost) {
                curCost -= diff[start];
                ++start;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
