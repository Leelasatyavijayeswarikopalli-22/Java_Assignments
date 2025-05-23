package Video_questions.conditions_loops.switchcase;
import java.util.Scanner;
public class DescribeFruit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a fruit to know it's description[apple,mango,orange,grapes]:");
        String fruit=input.nextLine();

        switch(fruit){
            case "apple":
                System.out.println("red fruit");
                break;
            case "mango":
                System.out.println("King of fruits");
                break;
            case "orange":
                System.out.println("A round fruit");
                break;
            case "grapes":
                System.out.println("Available in bunches");
                break;
            default:
                System.out.println("Enter the fruits in the list");

        }
    }
}
