package Video_questions.Algorithms.Linearsearch;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr =new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}
