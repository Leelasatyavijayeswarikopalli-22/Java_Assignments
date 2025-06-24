package Video_questions.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(1324));
    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }
}
