package Video_questions.Algorithms.Sorting.Cyclic;

import java.util.Arrays;

//Amazon question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct=arr[i];
            if (arr[i] <arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (i = 0; i <arr.length ; i++) {
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
