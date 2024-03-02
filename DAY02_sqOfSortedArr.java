import java.util.Arrays;

public class DAY02_sqOfSortedArr {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString (sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (int)Math.pow (nums[i],2);
        }

        Arrays.sort (arr);
        return arr;
    }
}
