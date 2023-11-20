public class sol_4 {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};

        System.out.println("Original Array:");
        printArray(array);

        // Perform bubble sort in decreasing order
        bubbleSortDescending(array);

        System.out.println("\nSorted Array in Decreasing Order:");
        printArray(array);
    }

    // Function to perform bubble sort in decreasing order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if in the wrong order
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
