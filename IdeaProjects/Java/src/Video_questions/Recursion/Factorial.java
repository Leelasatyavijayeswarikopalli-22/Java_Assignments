package Video_questions.Recursion;

public class Factorial {
    public static void main(String[] args){
        int n=8;
        System.out.println( fac(n));
    }
    static int fac(int n){
      if(n==0){
          return 1;
      }
      return n*fac(n-1);
    }
}
