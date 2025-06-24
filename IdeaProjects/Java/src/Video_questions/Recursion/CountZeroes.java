package Video_questions.Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(sum(10001350));
    }
    static int count=0;
    static int sum(int n){
        if(n<=0){
            return 0;
        }
        int sum=n%10;
        if(sum==0){
            count++;
        }
        sum(n/10);
        return count;
    }
}
