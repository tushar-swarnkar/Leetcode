import java.util.HashMap;
import java.util.Map;

public class DAY102_subArrSumDivisibleBy2 {
    int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0, rem = 0; i < nums.length; i++) {
            rem = ((rem + nums[i]) % k + k) % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        int res = map.getOrDefault(0,0);
        for (int freq : map.values()) {
            res += freq * (freq - 1) / 2;
        }
        return res;
    }
}
