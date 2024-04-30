public class DAY61_wonderfulStrings {

    // LEETCODE : 1915

    public static void main(String[] args) {
        String word = "aba";
        System.out.println(wonderfulSubstrings(word));
    }
    static long wonderfulSubstrings(String word) {
        long cnt[] = new long[1024], res = 0;
        int mask = 0;
        cnt[0] = 1;

        for (var ch : word.toCharArray()) {
            mask ^= 1 << (ch - 'a');
            res += cnt[mask];

            for (var n = 0; n < 10; ++n) {
                res += cnt[mask ^ (1 << n)];
            }
            ++cnt[mask];
        }

        return res;
    }
}
