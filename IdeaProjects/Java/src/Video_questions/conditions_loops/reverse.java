package Video_questions.conditions_loops;

public class reverse {
    public static void main(String[] args) {
        int n=1234;
       int remainder=0;
       int result=0;
        while(n>0){
            remainder=n%10;
           n/=10;
           result=result*10+remainder;
        }
        System.out.println(result);
    }
}
