package Video_questions.BItwiseOperators_NumberSystem;
//Given an array with all numbers with their negatives,find a number which is not having its negative
public class Q3 {
    public static void main(String[] args) {
        int[] arr={2,4,-2,-4,3};
        int answer=0;
        for (int i = 0; i <arr.length ; i++) {
           answer+=arr[i];
        }
        System.out.println(answer);
    }
}
