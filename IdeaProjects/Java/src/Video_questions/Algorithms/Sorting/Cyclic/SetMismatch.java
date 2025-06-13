package Video_questions.Algorithms.Sorting.Cyclic;

import java.util.Arrays;

//Repetition of one number and loss of another number
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(Mismatch(arr)));
    }
    static int[] Mismatch(int[] arr){
        int i=0;
        int[] nums={0,0};
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (i = 0; i <arr.length ; i++) {
            if(arr[i]!=i+1){
                nums[0]=arr[i];
                nums[1]=i+1;
                break;
            }
        }
        return nums;
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
