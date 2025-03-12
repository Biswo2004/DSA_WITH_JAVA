public class Kth_Largest_Element_in_Array {
    // Function to swap two elements in the array
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Partition function similar to QuickSort
    static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (nums[j] >= pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    // Quickselect function to find the Kth largest element
    static int quickSelect(int[] nums, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(nums, low, high);

            if (pi == k) {
                return nums[pi];
            } else if (pi > k) {
                return quickSelect(nums, low, pi - 1, k);
            } else {
                return quickSelect(nums, pi + 1, high, k);
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4}; // Example array
        int k = 2; // Kth largest element
        int result = quickSelect(nums, 0, nums.length - 1, k - 1);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}

