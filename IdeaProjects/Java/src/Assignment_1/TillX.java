package Assignment_1;

import java.util.Scanner;

public class TillX {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter values[Inputs will be taken until you press X]:");
       int num=0;
        int sum=0;
        char X=(char)(num);
        do{
            num=i.nextInt();
            sum=+num;
        }while(num!='X');
        System.out.println("Sum is = "+ sum);
    }
}
