package Video_questions.Algorithms.Sorting.Cyclic;
//Amazon
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9};
        System.out.println(MissingPositive(arr));  // prints 3
    }

    static int MissingPositive(int[] arr) {
        int n = arr.length, i = 0;
        while (i < n) {
            int correct = arr[i]-1 ;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i +1) {
                return i+1 ;
            }
        }
        return n+1 ;
    }

    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}