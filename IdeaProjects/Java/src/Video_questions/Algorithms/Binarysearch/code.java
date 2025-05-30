package Video_questions.Algorithms.Binarysearch;

public class code {
    public static void main(String[] args) {
        int[] arr={-12,-7,-1,0,12,16,18,32,37,48,55,63,78,83,89,92,95,98,100};
        int target=100;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
