package Video_questions.Algorithms.Sorting;
import java.util.Arrays;
public class InsertionSorting {
    public static void main(String[] args) {
    int[] arr={2,10,7,5,9,10,10,13,6};
    insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>=0;j--){
                if(arr[j]>=arr[j-1]){
                    break;
                }
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
