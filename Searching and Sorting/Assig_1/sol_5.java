public class sol_5 {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};

        System.out.println("Original Array:");
        printArray(array);

        // Perform selection sort in descending order
        selectionSortDescending(array);

        System.out.println("\nSorted Array in Decreasing Order:");
        printArray(array);
    }

    // Function to perform selection sort in descending order
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the maximum element in the unsorted region
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element of the unsorted region
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
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
