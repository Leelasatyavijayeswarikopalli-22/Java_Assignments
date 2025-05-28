package Video_questions.Arrays;
import java.util.Arrays;
public class Swap_functions {
    public static void main(String[] args) {
//int[] arr={1,2,3,4,5];
        //swap(arr,1,2);
        swap(1,2);

    }
    static void swap( int index1,int index2){       //static void swap(int arr[],int index1,int index2){}
        int[] arr={1,2,3,4,5};
       int temp=arr[index2];
       arr[index2]=arr[index1];
       arr[index1]=temp;
        System.out.println(Arrays.toString(arr));
    }

}
