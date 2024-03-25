import java.util.ArrayList;
import java.util.List;

public class DAY25_findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr) {
        // same as finding all missing 

        int i = 0;
        while (i < arr.length ) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap (arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int ind = 0; ind < arr.length; ind++) {
            if (arr[ind] != ind+1) {
                ans.add (arr[ind]);
            }
        }
        return ans;
    }
    static void swap (int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
