import java.util.ArrayList;
import java.util.List;

public class DAY83_subsets {
    public static void main(String[] args) {

    }

    static List<List<Integer>> result;

    static List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList();
        if (nums == null || nums.length == 0)
            return result;

        subsets(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    static void subsets(int[] nums, ArrayList<Integer> temp, int index) {
        // base condition
        if (index >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // main logic
        // case 1 : we pick the element
        temp.add(nums[index]);
        subsets(nums, temp, index + 1); // move ahead
        temp.remove(temp.size() - 1);

        // case 2 : we don't pick the element ( notice, we did not add the current
        // element in our temporary list
        subsets(nums, temp, index + 1); // move ahead
    }
}
