package Video_questions.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = null;
        System.out.println(p(palindrome));
    }
     static boolean p(String palindrome){
        if(palindrome==null){
            return true;
        }
       int start=0;
       int end=palindrome.length()-1;
    while(start<end){
        if(palindrome.charAt(start)==palindrome.charAt(end)){
            start++;
            end--;
        }else{
           return false;
        }
    }
      return true;
    }
}
