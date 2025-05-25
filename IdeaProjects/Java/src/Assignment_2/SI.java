package Assignment_2;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the Principle:");
        int p=i.nextInt();
        System.out.print("Enter the Time Period:");
        int t=i.nextInt();
        System.out.print("Enter the Rate of interest:");
        int r=i.nextInt();
        System.out.println("The simple interest is "+(p*t*r)/100);
    }

}
