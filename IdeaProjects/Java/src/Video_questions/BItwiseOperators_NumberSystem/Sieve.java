package Video_questions.BItwiseOperators_NumberSystem;
//Find prime number
public class Sieve {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];//index itself as number
        prime(n,primes);
    }
    static void prime(int n,boolean[] primes){
        for (int i = 2; i*i<=n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;                       //Making "not prime numbers" to true leaving prime numbers as answer
                }
            }

        }
        for (int i = 2; i <n ; i++) {
            if(!primes[i]){
                System.out.println(i);
            }
        }
    }
}
