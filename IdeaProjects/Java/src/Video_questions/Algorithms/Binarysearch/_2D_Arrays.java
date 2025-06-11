package Video_questions.Algorithms.Binarysearch;
//when rows and columns are sorted
import java.util.*;

public class _2D_Arrays {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     int target=3;
        System.out.println(Arrays.toString(binary_search_2D(arr,target)));

    }
    static int[] binary_search_2D(int[][]arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length&& c>=0){

      if(arr[r][c]==target){
          return new int[]{r,c};
        }
      if(arr[r][c]<target){
          r++;
      }else{
          c--;
      }
            }
        return new int[]{-1,-1};
    }
}
