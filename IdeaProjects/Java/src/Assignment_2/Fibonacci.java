package Assignment_2;

import java.util.Scanner;

//Calculate fibonacci series up to "n" numbers
public class Fibonacci {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=i.nextInt();
        int a=0;
        int b=1;
        int c=2;
        System.out.println("Fibonacci series are:");
        System.out.print(a+",");
        while(c<=n){
                int temp=a;
                a=b;
                b=a+temp;
                c++;
            System.out.print(b+",");
            }

        }
    }

