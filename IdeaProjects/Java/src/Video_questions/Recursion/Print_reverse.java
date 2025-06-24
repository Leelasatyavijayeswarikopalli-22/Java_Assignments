package Video_questions.Recursion;

public class Print_reverse {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n<1){
            return;
        }
        System.out.println(n);             //To print 1-5  :print(n-1);  System.out.println(n);
        print(n-1);
    }
}
