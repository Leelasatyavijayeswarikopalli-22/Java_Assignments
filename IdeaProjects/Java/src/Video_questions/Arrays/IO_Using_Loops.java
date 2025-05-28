package Video_questions.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class IO_Using_Loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int[] arr =new int[6];
       for(int i=0;i<arr.length;i++){
           arr[i]=input.nextInt();
       }
//3 methods to print an array:
 //1.
        System.out.print(Arrays.toString(arr) + " ");
       //2.
        /* for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i] + " ");
                  }
                  */
        //3.
        /*for(int j:arr){
        System.out.print(i + " ");
        }
         */
    }
}
