public class Container_With_Most_Water {
    // Function to find the maximum area of water that can be contained
    static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the area with the current left and right pointers
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            // Move the pointers inward to find a potentially larger area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Example array of heights
        int maxWater = maxArea(height);
        System.out.println("Maximum area of water that can be contained is: " + maxWater);
    }
}
