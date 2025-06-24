package Video_questions.BItwiseOperators_NumberSystem;
//You are given a number find out if it is power of 2 or not
public class Q11 {
    public static void main(String[] args) {
        int n=16;
        if(n>1&&(n&(n-1))==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
