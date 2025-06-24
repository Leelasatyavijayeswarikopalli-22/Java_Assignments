package Video_questions.Recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={2,3,13,15,56,67,83,90,91,92,94,99,101};
        int target=56;
        System.out.println(bs(arr,target,0,arr.length-1));
    }
    static int bs(int[] arr,int target,int start,int end){
       if(start>end){
           return -1;
       }
       int mid=start+(end-start)/2;
       if(target<arr[mid]){
         return bs(arr,target,start,mid-1);
       }
       if(target>arr[mid]){
         return bs(arr,target,mid+1,end);
       }
       if(target==arr[mid]) {
           return mid;
       }
       return -1;
    }
}
