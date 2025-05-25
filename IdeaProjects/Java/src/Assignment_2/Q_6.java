package Assignment_2;
import java.util.Scanner;
//Input currency in rupees and output in USD
public class Q_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Rupees to USD currency converter");
        System.out.println("Enter the value in rupees:");
        float n=input.nextInt();
        System.out.println((n/65)+"$");
    }
}
