package Assignment_2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.println("Armstrong numbers between " + a + " and " + b + ":");
        for (int num = a; num <= b; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (originalNum > 0) {
                int remainder = originalNum % 10;
                sum += Math.pow(remainder, digits);
                originalNum /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
