package Video_questions.Recursion;

public class Sum_Of_n_numbers {
    public static void main(String[] args) {
        System.out.println(print(10));
    }
    static int print(int n){
        if(n==0){
            return 0;
        }
        return n+print(n-1);
    }
}
