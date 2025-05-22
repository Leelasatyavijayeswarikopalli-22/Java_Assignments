package Assignment_1;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the year to know whether it is leap year or not:");
        int year=i.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println("It is a leap year");
            }else{
                System.out.println("It is not a leap year");
            }
        }else if(year%4==0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }

    }
}
