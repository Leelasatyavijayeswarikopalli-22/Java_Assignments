package Video_questions.BItwiseOperators_NumberSystem;
//Amazon[Find nth magic number]:1=>0 0 1 = 5^1 = 5
//                              2=>0 1 0 = 5^2 = 25
//                              3=>0 1 1 = 5^1+5^2 = 30  ......
public class Q9 {
    public static void main(String[] args) {
        int n=7;
        int Answer=0;
        int count=(int)(Math.log(n)/Math.log(2))+1;
        for(int i=1;i<=count;i++){
            if(((n&(1<<(i-1)))>>(i-1))==1){
            Answer+=Math.pow(5,i);
            }
        }
        System.out.println(Answer);
    }
}
