package Assignment_2;
//Take name and print greeting message for that particular name
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine();
        System.out.println("Hello "+name+"!!");

    }
}
