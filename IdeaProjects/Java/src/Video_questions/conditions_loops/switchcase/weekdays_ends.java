package Video_questions.conditions_loops.switchcase;

import java.util.Scanner;

public class weekdays_ends {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter (1-7) to get day:");
        int day=input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number");
        }
    }
}
