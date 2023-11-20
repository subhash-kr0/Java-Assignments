public class sol_2 {
    public static void segregateElements(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
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
