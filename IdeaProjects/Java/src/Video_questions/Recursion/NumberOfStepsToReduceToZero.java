package Video_questions.Recursion;

public class NumberOfStepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(count(14));
    }
    static int count=0;
    static int count(int n) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            count++;
            return count(n / 2);
        } else {
            count++;
            return (n - 1);
        }
    }
}
