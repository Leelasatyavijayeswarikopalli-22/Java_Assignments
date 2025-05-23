package Video_questions.conditions_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double result = 0;
        while (true) {
            System.out.println("Enter the operator:");
            char op = i.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                double num1 = i.nextInt();
                double num2 = i.nextInt();
                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Denominator can't be 0");
                    }else{
                       result=num1/num2;
                    }
                }
                if(op=='%'){
                    result =num1%num2;
                }

            }else if(op=='X' || op=='x'){
                break;
            }else{
                System.out.println("Operator is invalid");
            }

            System.out.println("Output is:"+ result);
        }
    }
}