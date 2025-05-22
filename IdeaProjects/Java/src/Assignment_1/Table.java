package Assignment_1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the number to get its table:");
        int num=i.nextInt();
        for(int count=1;count<=10;count++){
            System.out.println(num +" X "+count+" = "+ num*count);
        }
    }
}
