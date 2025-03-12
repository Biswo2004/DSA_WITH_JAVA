import java.util.Arrays;
public class Kth_Smallest_Element_in_Arra {
        public static void main(String[] args) {
            int[] arr = {5, 8, 4, 6, 9, 3, 2, 1, 0};
            int k = 3;

            Arrays.sort(arr);

            int kthSmallest = arr[k - 1];
            System.out.println(k + "th smallest element is " + kthSmallest);

        }
    }
