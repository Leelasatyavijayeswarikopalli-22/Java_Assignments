package Video_questions.BItwiseOperators_NumberSystem;
//Google[Flipping an image]:First reverse each row,then make 0=>1 and 1=>0
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        for(int[] i:arr){
            int start=0;
            int end=i.length-1;
           while(start<end){
             int temp=i[start];
             i[start]=i[end];
             i[end]=temp;
             start++;
             end--;
           }
        }
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                i[j] = i[j] ^ 1;
            }
        }
for(int[] i:arr){
    System.out.println(Arrays.toString(i));
}
}
}
