import java.util.Arrays;

public class DAY71_maximizeHappiness {

    // LEETCODE : 3075

    public static void main(String[] args) {
        int[] happiness = {1,2,3};
        int k = 2;

        System.out.println(maximumHappinessSum(happiness, k));
    }
    static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        int n = happiness.length, j = 0;

        for (int i = n - 1; i >= n - k; --i) {
            happiness[i] = Math.max(happiness[i] - j++, 0);
            res += happiness[i];
        }

        return res;
    }
}
