package Video_questions.conditions_loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n[to get nth fibonacci number]:");
        int num1=0;
        int num2=1;
        int n=in.nextInt();
        int temp=0;
        for(int c=2;c<=n;c++){
            temp = num2;
           num2=num2+num1;
           num1=temp;
        }
        System.out.println(num2);
    }
}
