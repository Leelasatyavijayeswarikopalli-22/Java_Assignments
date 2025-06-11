package Video_questions.Algorithms.Binarysearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
int[] arr={1,2,3,9,8,7,6,5,4};
        System.out.println(PeakValue(arr));
    }
    static int PeakValue(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end];
    }
}
