package Video_questions.Algorithms.Binarysearch;

import java.util.Arrays;

public class SearchInSortedArray_2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        System.out.println(Arrays.toString(search_inSort(arr,target)));

    }
    static int[] binarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }if(arr[row][mid]<target){
               cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search_inSort(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;         //be cautious, matrix may be empty
        if(rows==1){
            return binarySearch(arr,rows,0,cols-1, target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        while (rStart < (rEnd-1)) {
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{rStart,cMid};
            }
            if(arr[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in 1st half
        if(target<=arr[rStart][cMid-1]){
            return binarySearch(arr,rStart,0,cMid-1, target);
        }
        //search in 2nd half
        if(target>=arr[rStart][cMid+1]&&target<=arr[rStart][cols-1]){
            return binarySearch(arr,rStart,cMid+1,cols-1, target);
        }
        //search in 3rd half
        if(target<=arr[rStart+1][cMid-1]){
            return binarySearch(arr,rStart+1,0,cMid-1, target);
        }else{
            return binarySearch(arr,rStart+1,cMid+1,cols-1, target);
        }

    }
}
