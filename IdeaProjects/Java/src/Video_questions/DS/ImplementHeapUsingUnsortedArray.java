package Video_questions.DS;

import java.util.Arrays;

public class ImplementHeapUsingUnsortedArray {
    public static void main(String[] args) {
        int[] arr={4,1,3,2,16,9,10,14,8,7,15};
        int n=arr.length;
        for (int i = n/2-1; i >=0 ; i--) {
            h(arr,n,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void h(int[] arr,int n,int i){
           int largest=i;
           int left = i * 2 + 1;
           int right = i * 2 + 2;
           if ( left<n && arr[largest] < arr[left]) {
               largest=left;
           }
           if (right < n && arr[largest] < arr[right]) {
               largest=right;
           }
          if(largest!=i){
              int temp=arr[i];
              arr[i]=arr[largest];
              arr[largest]=temp;
              h(arr,n,largest);
          }
    }
}
