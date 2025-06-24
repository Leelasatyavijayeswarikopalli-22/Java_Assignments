package Video_questions.BItwiseOperators_NumberSystem;
//Reset the ith bit always to 0
public class Q6 {
    public static void main(String[] args){
        int n=10;
        int i=2;
        System.out.println(n&(~(1<<i)));
    }
}
