package Video_questions.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr =new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
