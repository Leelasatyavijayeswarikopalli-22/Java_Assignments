package Video_questions.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = input.nextInt();
            }
        }
       /* for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
      for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
   /*     for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }*/
    }
}
