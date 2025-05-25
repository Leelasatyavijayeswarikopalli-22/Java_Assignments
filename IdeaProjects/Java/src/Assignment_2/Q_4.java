package Assignment_2;
import java.util.Scanner;
//Take two numbers and an operator and calculate the value
public class Q_4 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        double a=i.nextInt();
        System.out.print("Enter the value of b:");
        double b=i.nextInt();
        System.out.println("Enter the operator[+,-,*,/,%]:");
        char operator=i.next().trim().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Sum is "+(a+b));
                break;
            case '-':
                System.out.println("Difference is "+(a-b));
                break;
            case '*':
                System.out.println("Product is "+(a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("Undefined");
                }else {
                    System.out.println("Division is " + (a / b));
                }
                break;
            case '%':
                System.out.println("Remainder is "+(a%b));
                break;
            default:
                System.out.println("Enter valid operator");
        }

    }
}
