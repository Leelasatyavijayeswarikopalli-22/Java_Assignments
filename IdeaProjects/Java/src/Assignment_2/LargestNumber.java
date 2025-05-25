package Assignment_2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=i.nextInt();
        System.out.print("Enter the value of b:");
        int b=i.nextInt();
        System.out.println("The largest value is "+ Math.max(a,b));
       /* int max=a;
        if(b>max){
            max=b;
            System.out.println("The largest number is "+max);
        }else{
            max=a;
            System.out.println("The largest number is "+max);
        }*/

    }
}
