import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DAY145_sortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] arr = new String[names.length];
        int ind = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            arr[ind] = map.get(heights[i]);
            ind++;
        }

        return arr;
    }
}
