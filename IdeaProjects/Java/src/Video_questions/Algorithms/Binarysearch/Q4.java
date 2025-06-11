package Video_questions.Algorithms.Binarysearch;

import java.util.Arrays;

// Find first and last position of element in sorted array
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 5,5, 6, 7, 8, 11, 11, 16};
        System.out.println(Arrays.toString(order(arr, 5))); // Output should be [1, 2]
    }

    static int[] order(int[] arr, int target) {
        int[] answer = {-1, -1};
        answer[0] = search(arr, target, true);  // first occurrence
        if (answer[0] != -1) {
            answer[1] = search(arr, target, false); // last occurrence
        }
        return answer;
    }

    static int search(int[] arr, int target, boolean find) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (find) {
                    end = mid - 1; // look on the left side
                } else {
                    start = mid + 1; // look on the right side
                }
            }
        }

        return ans;

    }
}
