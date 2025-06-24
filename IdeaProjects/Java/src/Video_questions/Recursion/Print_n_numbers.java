package Video_questions.Recursion;

public class Print_n_numbers {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
