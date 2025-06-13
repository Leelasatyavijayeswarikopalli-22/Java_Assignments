package Video_questions.Algorithms.Sorting.Cyclic;
//One duplicate number
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,1};
        System.out.println(Duplicate(arr));
    }
    static int Duplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (i = 0; i <arr.length ; i++) {
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        return -1;
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
