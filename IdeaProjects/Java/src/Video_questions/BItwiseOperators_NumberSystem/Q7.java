package Video_questions.BItwiseOperators_NumberSystem;
//Find the position of the right most bit
public class Q7 {
    public static void main(String[] args){
        int n=20;
        System.out.println(rightMostBit(n));
    }
    static int rightMostBit(int n){
        for(int i=0;i<n;i++){
            if((n>>i&1)==1){
               return i+1;
            }
        }
        return -1;
    }
}
