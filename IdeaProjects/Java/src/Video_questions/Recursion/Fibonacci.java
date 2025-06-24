package Video_questions.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
//    public static void main(String[] args) {
//        int n =6;
//        int c=2;
//        int a=0;
//        int b=1;
//        int sum=0;
//        fibonacci(n,a,b,sum,c);
//    }
//        static void fibonacci(int n,int a,int b,int sum,int c){
//            if(c>n){
//                System.out.println(b);
//                return ;
//            }
//        sum=a+b;
//        a=b;
//        b=sum;
//        c++;
//         fibonacci(n,a,b,sum,c);
//        }

