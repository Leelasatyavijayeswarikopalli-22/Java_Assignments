package Video_questions.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {

        System.out.println( reverse(1234,0));
    }
    static int reverse(int n,int sum){
        if(n==0){
            return sum;
        }
      int  remainder=n%10;
       sum=sum*10+remainder;
        reverse(n/10,sum);
      return sum;
    }
}
