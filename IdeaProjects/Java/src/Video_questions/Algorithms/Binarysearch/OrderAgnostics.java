package Video_questions.Algorithms.Binarysearch;

public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr={100,44,6,0,-22,-66};
        int target=100;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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


