package Video_questions.Algorithms.Binarysearch;
//Greatest number that is smaller or equal to target number
public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr={1,23,44,65,78,91,95,101};
        int target=43;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return target;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        //start=end+1    As loop breaks;

        return arr[end];
    }
}

