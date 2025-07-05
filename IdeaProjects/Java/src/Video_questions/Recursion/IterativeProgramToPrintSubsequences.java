package Video_questions.Recursion;

import java.util.ArrayList;
import java.util.List;

public class IterativeProgramToPrintSubsequences {
    public static void main(String[] args){
        int[] arr={1,2,3};
        List<List<Integer>> ans=printSub(arr);
        for(List<Integer> i:ans) {
            System.out.println(i);
        }
    }
    static List<List<Integer>> printSub(int[] arr){
        List<List<Integer>> external =new ArrayList<>();
        external.add(new ArrayList<Integer>());
       for(int i:arr){
         int n= external.size();
           for (int j = 0; j <n ; j++) {
               List<Integer> internal =new ArrayList<>(external.get(j));//we will get the copy of external into internal
               internal.add(i);
               external.add(internal);
           }
       }
       return external;
    }
}
