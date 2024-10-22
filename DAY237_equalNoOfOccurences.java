import java.util.HashMap;
import java.util.Map;

public class DAY237_equalNoOfOccurences {

    static int sameOccurrence(int arr[], int x, int y) {

        Map<Integer, Integer> mp = new HashMap<>();

        int countDiff = 0, ans = 0;

        mp.put(0, 1);

        for (int i : arr) {
            if (i == x) {
                countDiff++;
            } else if (i == y) {
                countDiff--;
            }

            if (mp.containsKey(countDiff)) {
                ans += mp.get(countDiff);
            }

            mp.put(countDiff, mp.getOrDefault(countDiff, 0) + 1);
        }

        return ans;
    }

}
