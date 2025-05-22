package Video_questions;

import java.util.Scanner;

public class largestnumber_2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = i.nextInt();
        System.out.println("Enter the value of b:");
        int b = i.nextInt();
        System.out.println("Enter the value of c:");
        int c = i.nextInt();
        int max = Math.max(c, Math.max(a, b));
        System.out.println("Largest value is "+max);

    }
}
