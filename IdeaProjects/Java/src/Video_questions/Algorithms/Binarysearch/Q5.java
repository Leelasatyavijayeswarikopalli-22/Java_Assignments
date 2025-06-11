package Video_questions.Algorithms.Binarysearch;
//Find position of an element in a sorted array of infinite numbers
public class Q5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(search(arr,0));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;                              //mid=(start+end)/2  =>if (start+end)>int range we can't search
            if(target<arr[mid]){                                  //so we use this formula in order to overcome that problem
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
