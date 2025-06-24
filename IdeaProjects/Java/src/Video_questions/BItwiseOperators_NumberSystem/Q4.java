package Video_questions.BItwiseOperators_NumberSystem;
//Find ith bit if a number n
public class Q4 {
    public static void main(String[] args) {
       int n=7;
       int i=2;
        System.out.println((n&(1<<i))>>i);
    }
}
