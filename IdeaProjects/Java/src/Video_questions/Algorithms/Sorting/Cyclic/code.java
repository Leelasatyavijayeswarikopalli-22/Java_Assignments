package Video_questions.Algorithms.Sorting.Cyclic;
import java.util.Arrays;


public class code {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4,8,7,6};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
               swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
