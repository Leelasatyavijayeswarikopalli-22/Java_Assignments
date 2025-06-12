package Video_questions.Algorithms.Sorting;
import java.util.Arrays;
public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr={2,9,12,4,6,14,10,1,0,-20};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[last];
            arr[last]=temp;
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = 0; i <= end; i++) {
          if(arr[max]<arr[i]){
              max=i;
          }
        }
        return max;
    }
}
