import java.util.HashMap;
import java.util.Map;

public class DAY08_eleWithMaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};

        System.out.println(maxFrequencyElements(nums));
    }

    static int maxFrequencyElements(int[] nums) {
        // TIME COMP = O(n)
        // SPACE COMP = O(n)

        // Step 1: frequency calculation
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put (n, map.getOrDefault(n,0) + 1);
        }

        // Step 2: find maximum frequency
        int maxi = 0;
        for (int val : map.values()) {
            maxi = Math.max (maxi, val);
        }

        // Step 3: calculate total frequency with maximum frequency
        int ans = 0;
        for (int val : map.values()) {
            if (val == maxi) {
                ans += val;
            }
        }

        // return resul
        return ans;


        // TIME COMP = O(n)
        // SPACE COMP = O(1)

        // int[] a = new int[101];
        // for (int i : nums) {
        //     a[i]++;
        // }
        // int maxi = 0;
        // for (int i = 0; i <= 100; i++) {
        //     maxi = Math.max (maxi, a[i]);
        // }
        // int ans = 0;
        // for (int i = 0; i <= 100; i++) {
        //     if (a[i] == maxi) {
        //         ans += maxi;
        //     }
        // }
        // return ans;
    }
}
