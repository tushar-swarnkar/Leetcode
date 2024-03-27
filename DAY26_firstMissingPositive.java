public class DAY26_firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};

        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap (nums, i, correct);
            } else {
                i++;
            }
        }

        for (int ind = 0; ind < nums.length; ind++) {
            if (nums[ind] != ind + 1) {
                return ind + 1;
            }
        }
        return nums.length + 1;
    }
    static void swap (int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}