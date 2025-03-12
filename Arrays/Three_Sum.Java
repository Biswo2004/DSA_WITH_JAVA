import java.util.Arrays;

public class Three_Sum {
    // Function to find all unique triplets that sum up to zero
    static int[][] threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        int[][] result = new int[n * n][3]; // Estimate maximum possible pairs
        int k = 0;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result[k][0] = nums[i];
                    result[k][1] = nums[left];
                    result[k][2] = nums[right];
                    k++;

                    left++;
                    right--;

                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return Arrays.copyOf(result, k); // Trim the result array to the actual size
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4}; // Example array
        int[][] triplets = threeSum(nums);

        System.out.println("Unique triplets that sum up to zero are:");
        for (int[] triplet : triplets) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}
