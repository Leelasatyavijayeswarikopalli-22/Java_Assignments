package Video_questions.Recursion;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={3,2,1,18,9};
        int target=3;
        System.out.println(search(arr,target,0));
    }
    static int search(int[] arr,int target,int start){
        if(start==arr.length){
            return -1;
        }
        if(target==arr[start]){
            return start;
        }
        return search(arr,target,start+1);
    }
}
