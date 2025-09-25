/**
 * Trapping Rain Water
 * Problem: Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 *
 * Approach: Two-pointer technique (O(n) time, O(1) extra space).
 *
 * Example:
 *   Input:  [0,1,0,2,1,0,1,3,2,1,2,1]
 *   Output: 6
 *
 */

public class Trapping_Rain_Water {

    /**
     * Computes the total trapped water.
     *
     * @param height array of non-negative integers representing elevation map
     * @return total units of trapped water
     */
    public static int trap(int[] height) {
        if (height == null || height.length < 3) return 0;

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trapped = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trapped += rightMax - height[right];
                }
                right--;
            }
        }
        return trapped;
    }

    // Simple test harness
    public static void main(String[] args) {
        int[][] tests = {
            {0,1,0,2,1,0,1,3,2,1,2,1}, // expected 6
            {4,2,0,3,2,5},             // expected 9
            {},                        // expected 0
            {2,0,2},                   // expected 2
            {3,0,0,2,0,4}              // expected 10
        };

        int[] expected = {6, 9, 0, 2, 10};

        for (int i = 0; i < tests.length; i++) {
            int got = trap(tests[i]);
            System.out.printf("Test %d: got=%d expected=%d => %s%n",
                              i+1, got, expected[i], (got == expected[i] ? "PASS" : "FAIL"));
        }
    }
}

