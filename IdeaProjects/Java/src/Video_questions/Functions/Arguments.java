package Video_questions.Functions;

import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=input.next();
        String message=greet(name);
        System.out.println(message);
    }

    private static String greet(String name) {
        String greeting="Hello "+name+"!!";
        return greeting;
    }
}
