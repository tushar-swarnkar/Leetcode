import java.util.Arrays;

public class DAY18_minArrowsToBurstBalloons {
    public static void main(String[] args) {
        int[][] p = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(findMinArrowShots(p));
    }
    static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;
        Arrays.sort(points, (int[] p1, int[] p2)->{
		    // Don't use p1[1 ] - p2[1]. It may overflow 
            return p1[1] < p2[1] ? -1 : 1; 
        });
        int end = points[0][1];
		
		// the reason res = 1 is that we need an arrow to destroy the last group. 
        int res = 1;
        for (int[] point: points)
        {
            if (point[0] <= end) continue;
            res++;
            end = point[1];
        }
        return res;
    }
}
