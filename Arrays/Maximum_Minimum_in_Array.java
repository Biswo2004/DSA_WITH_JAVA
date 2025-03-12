public class Maximum_Minimum_in_Array {
    public static void findMaxMin(int[] arr) {
        // Initialize min and max to the first element
        int min = arr[0];
        int max = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the results
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, 7, 6};
        findMaxMin(arr);
    }
}
