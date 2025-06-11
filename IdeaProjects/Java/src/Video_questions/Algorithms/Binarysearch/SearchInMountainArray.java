package Video_questions.Algorithms.Binarysearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,8,7,6,5,4};
        int target=2;
    }
    static int SearchMountain(int[] arr,int target,int start){
        int peak=PeakValue(arr);
        int FirstTry=search(arr,target,start,peak);
        if(FirstTry!=-1){
            return FirstTry;
        }
        return search(arr,target,peak+1,arr.length-1);
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
    static int search(int[] arr,int target,int start,int end){
         start=0;
         end=arr.length-1;
        boolean isasc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}


























