package Assignment_2;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=i.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("odd number");
            }

    }
}
