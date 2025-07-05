package Video_questions.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequencesWithDuplicates {
    public static void main(String[] args){
        int[] arr={1,2,3,2};
        List<List<Integer>> ans=printSub(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> printSub(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> external =new ArrayList<>();
        external.add(new ArrayList<Integer>());
        int start=0;
        int end=0;
        for (int i = 0; i <arr.length ; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = external.size() - 1;
                int n = external.size();
                for (int j =start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(external.get(j));//we will get the copy of external into internal
                    internal.add(arr[i]);
                    external.add(internal);
                }
        }
        return external;
    }
}
