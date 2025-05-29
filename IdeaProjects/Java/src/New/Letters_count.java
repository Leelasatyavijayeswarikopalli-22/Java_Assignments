package New;

import java.util.Scanner;
//No.of times the letter occurs in a sentence
public class Letters_count {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        System.out.println("Enter the letter to check:");
        char c=input.next().trim().charAt(0);
        System.out.println(letter(str,c));
    }
    static int letter(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.trim().charAt(i);
            if(ch==c){
                count++;
            }
        }
        System.out.println("No.of times the letter occurs is:");
       return count;
    }
}
