public class Next_Permutation  {
    // Function to swap two elements in the array
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Function to reverse elements in the array from start to end index
    static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Function to find the next permutation
    static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the element just larger than nums[i]
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap the elements
            swap(nums, i, j);
        }

        // Step 4: Reverse the elements from i+1 to the end of the array
        reverse(nums, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example array
        nextPermutation(nums);
        System.out.print("Next permutation is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
