package Video_questions.Algorithms.Sorting.Cyclic;

import java.util.ArrayList;
import java.util.List;

//Google Question
public class ArraysDisappeared {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(Disappear(arr));
    }
    static List<Integer> Disappear(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> answer=new ArrayList<>();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                answer.add(i+1);
            }
        }
        return answer;
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
