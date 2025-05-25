package Assignment_2;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the word to check whether palindrome or not:");
      Scanner input=new Scanner(System.in);
      String a=input.next();
      int n=a.length();
      String rev="";
      for(int i=0;i<=n-1;i++){
           rev=rev+a.trim().charAt(n-1-i);
      }
       if(a.equals(rev)){
           System.out.println("palindrome");
       }else{
           System.out.println("Not Palindrome");
       }
    }
}
