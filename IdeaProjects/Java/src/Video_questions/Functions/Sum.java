package Video_questions.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=i.nextInt();
        System.out.print("Enter the value of b:");
        int b=i.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+ sum);

    }
}
