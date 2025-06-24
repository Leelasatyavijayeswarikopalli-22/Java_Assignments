package Video_questions.BItwiseOperators_NumberSystem;
//Find the number which is not a duplicate
public class Q2 {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,6,8,5,7,6,8,7};
        int answer=0;
        for (int i = 0; i < arr.length; i++) {
          answer=answer^arr[i];
        }
        System.out.println(answer);
    }
}
