public class sol_1 {
    public static void sortSwappedElements(int[] arr) {
        int x = -1, y = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (x == -1) {
                    x = i;
                } else {
                    y = i + 1;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        sortSwappedElements(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
