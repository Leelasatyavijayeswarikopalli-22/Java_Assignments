package Video_questions.Algorithms.Sorting;
import java.util.*;
public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr={2,8,4,5,9,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapping=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                      int temp=arr[j];
                      arr[j]=arr[j-1];
                      arr[j-1]=temp;
                      swapping=true;
                }
            }
            if(swapping==false){
                break;
            }
        }
    }
}
