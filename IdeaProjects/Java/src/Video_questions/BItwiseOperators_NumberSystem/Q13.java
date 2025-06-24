package Video_questions.BItwiseOperators_NumberSystem;

public class Q13 {
    public static void main(String[] args) {
        int n=9;
        int count=0;
       for(int i=0;i<(int)(Math.log(n)/Math.log(2))+1;i++){
            if(((n&(1<<i))>>i)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
