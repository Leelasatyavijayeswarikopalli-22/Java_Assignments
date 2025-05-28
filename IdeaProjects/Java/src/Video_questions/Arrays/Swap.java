package Video_questions.Arrays;

import java.util.Arrays;

//swap indices of 2 and 3
public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=arr[3];
        arr[3]=arr[2];
        arr[2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
