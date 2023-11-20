import java.util.Random;

public class QuickSelect {
    public static int quickSelect(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k - 1);
    }

    private static int quickSelect(int[] nums, int low, int high, int k) {
        int pivot = partition(nums, low, high);
        if (pivot > k) {
            return quickSelect(nums, low, pivot - 1, k);
        } else if (pivot < k) {
            return quickSelect(nums, pivot + 1, high, k);
        } else {
            return nums[k];
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i++, j);
            }
        }
        swap(nums, i, high);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,4,5,6,7};
        int k = 3;
        System.out.println(quickSelect(nums, k));  // Output: 5
    }
}
