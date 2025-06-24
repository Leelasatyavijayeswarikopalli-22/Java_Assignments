package Video_questions.Recursion;

import java.util.ArrayList;

public class LinearSearch_MultipleOccurrences {
    public static void main(String[] args) {
        int[] arr={1,4,4,4,5,2,9,0,12,14,4,22,15,10};
        int target=4;
        ArrayList<Integer> List=new ArrayList<>();
        System.out.println(search2(arr,target,0));

    }
    static ArrayList search(int[] arr,ArrayList<Integer> List,int target,int start){
        if(start==arr.length){
            return List;
        }
        if(target==arr[start]){
            List.add(start);
        }
        return search(arr,List,target,start+1);
    }
    static ArrayList search2(int[] arr,int target,int start){
        ArrayList<Integer> List=new ArrayList<>();
        if(start==arr.length){
            return List;
        }
        if(target==arr[start]){
            List.add(start);
        }
        ArrayList<Integer> List2=search2(arr,target,start+1);
        List.addAll(List2);
        return List;
    }
}
