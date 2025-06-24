package Video_questions.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end) {
        if (end == 0) {
            return;
        }
        if (end > start) {
            if (arr[start] > arr[start + 1]) {
                swap(arr, start);
                sort(arr, start + 1, end);
            }
        }else {
            sort(arr,0, end - 1);
        }
    }
    static void swap(int[] arr,int i){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
