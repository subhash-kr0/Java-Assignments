public class sol_3 {
    public static void segregateElements(int[] arr) {
        int n = arr.length;
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        segregateElements(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
