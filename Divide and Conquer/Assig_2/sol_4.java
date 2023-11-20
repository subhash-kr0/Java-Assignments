import java.util.Arrays;
import java.util.Collections;

public class sol_4 {
    public static boolean isPossible(Integer []A, Integer []B, int n, int k) {
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < n; i++)
            if (A[i] + B[i] < k)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Integer A[] = {2, 1, 3};
        Integer B[] = {7, 8, 9};
        int k = 10;
        if (isPossible(A, B, A.length, k))
            System.out.println("Yes");
        else
            System.out.println("No");

        Integer A1[] = {1, 2, 2, 1};
        Integer B1[] = {3, 3, 3, 4};
        k = 5;
        if (isPossible(A1, B1, A1.length, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
