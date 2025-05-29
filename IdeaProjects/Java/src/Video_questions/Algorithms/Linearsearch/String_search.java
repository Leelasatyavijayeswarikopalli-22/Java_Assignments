package Video_questions.Algorithms.Linearsearch;
import java.util.Arrays;
import java.util.Scanner;
public class String_search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=input.nextLine();
        System.out.println("Enter the letter to check:");
        char c=input.next().trim().charAt(0);
        System.out.println(letter(str,c));
    }
    static int letter(String str,char c){
        for(int i=0;i<str.length();i++) {
            char ch = str.trim().charAt(i);                  /*for(char ch : str.toCharArray()){
                                                                  if(ch==c){
                                                                     System.out.println("The index is ");
                                                                       return i;
                                                                    }*/ //Because to access values through for each loop
                                                              //  we require a collection of data(like array)
            if(ch==c){
                System.out.println("The index is ");
                return i;
            }
        }
        System.out.println("The index is:");
        return -1;
    }
}
