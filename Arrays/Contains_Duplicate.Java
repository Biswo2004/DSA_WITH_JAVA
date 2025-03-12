import java.util.Arrays;

public class Contains_Duplicate {
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }
        
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 1}; // Example array with a duplicate
        if (containsDuplicate(nums)) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain duplicates.");
        }
    }
}
