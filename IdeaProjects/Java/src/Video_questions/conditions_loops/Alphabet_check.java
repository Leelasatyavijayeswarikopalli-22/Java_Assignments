package Video_questions.conditions_loops;
import java.util.Scanner;

public class Alphabet_check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("This Alphabet is uppercase");
        }else if(ch>='a'&&ch<='z'){
            System.out.println("This Alphabet is lowercase");
        }else{
            System.out.println("It is not a character");
        }
    }
}
