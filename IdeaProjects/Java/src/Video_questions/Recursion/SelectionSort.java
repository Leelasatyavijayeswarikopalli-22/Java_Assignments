package Video_questions.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int start,int last,int max){
        if(last==0){
            return;
        }
        if (start <= last) {
            if (arr[start] < arr[max]) {
                sort(arr,start+1,last,max);
            }else{
                sort(arr,start+1,last,start);
            }
        }else{
            swap(arr,max,last);
          sort(arr,0,last-1,0);
        }
    }
    static void swap(int[] arr,int i,int last){
        int temp=arr[i];
        arr[i]=arr[last];
        arr[last]=temp;
    }
}
