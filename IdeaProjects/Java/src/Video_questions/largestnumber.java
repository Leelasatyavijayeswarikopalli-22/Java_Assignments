package Video_questions;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=i.nextInt();
        System.out.println("Enter the value of b:");
        int b=i.nextInt();
        System.out.println("Enter the value of c:");
        int c=i.nextInt();
        int max=0;
        if(a>max){
            max=a;
        }else if(b>max){
            max=b;
        }else if(c>max){
            max=c;
        }
        System.out.println("Max value of three values is "+ max);
    }
}
