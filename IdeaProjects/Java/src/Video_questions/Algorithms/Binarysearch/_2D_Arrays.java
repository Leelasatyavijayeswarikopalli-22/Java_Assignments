package Video_questions.Algorithms.Binarysearch;

import java.util.*;

public class _2D_Arrays {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
     int target=3;
        System.out.println(Arrays.toString(binary_search_2D(arr,target)));

    }
    static int[] binary_search_2D(int[][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
        if(target==arr[i][j]){
            return new int[]{i,j};
        }
            }
        }
        return new int[]{-1,-1};
    }
}
