package Assignment_1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=i.nextInt();
        System.out.println("Enter the value of b:");
        int b=i.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+ sum);
    }
}
