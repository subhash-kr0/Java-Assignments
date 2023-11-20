import java.util.Arrays;
import java.util.Comparator;

public class sol_5 {
    public static boolean isOverlap(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {5, 7}, {2, 4}, {6, 8}};
        System.out.println(isOverlap(intervals1) ? "Yes" : "No");  // Output: Yes

        int[][] intervals2 = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};
        System.out.println(isOverlap(intervals2) ? "Yes" : "No");  // Output: No
    }
}
