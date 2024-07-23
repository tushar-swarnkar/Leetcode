import java.util.Arrays;

public class DAY146_sortArrayByIncreasingFreq {
    public int[] frequencySort(int[] nums) {
        int[] count = new int[201];
        for (int num : nums) {
            count[num + 100]++;
        }
        Integer[] numArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numArr, (a, b) -> {
            if (count[a + 100] == count[b + 100]) {
                return b - a;
            }
            return count[a + 100] - count[b + 100];
        });

        return Arrays.stream(numArr).mapToInt(Integer::intValue).toArray();
    }
}
