package Video_questions.Recursion;
//Google
import java.util.ArrayList;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args){
        System.out.println(letters("","7"));
        System.out.println(count("","7"));
    }
    static ArrayList<String> letters(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        if(ch=='1'||ch=='0'){
           return letters(p,up.substring(1));
        }
        int digit=up.charAt(0)-'0';
        switch(ch){
      case '8':
            for(int i=(digit-2)*3+1;i<=((digit-1)*3);i++) {
                char s=(char)('a'+i);
                ans.addAll(letters(p+s,up.substring(1)));
            }
            break;
            case '7':
            for(int i=(digit-2)*3;i<=((digit-1)*3);i++) {
                char s=(char)('a'+i);
                ans.addAll(letters(p+s,up.substring(1)));
            }
            break;

            case '9':
            for(int i=(digit-2)*3+1;i<=((digit-1)*3)+1;i++) {
                char s=(char)('a'+i);
                ans.addAll(letters(p+s,up.substring(1)));
            }
            break;
            default:
            for (int i = (digit - 2) * 3; i < ((digit - 1) * 3); i++) {
                char s = (char) ('a' + i);
                ans.addAll(letters(p + s, up.substring(1)));
            }
        }
        return ans;
    }
    //return count
    static int count(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
       int c=0;
        char ch=up.charAt(0);
        if(ch=='1'||ch=='0'){
            return count(p,up.substring(1));
        }
        int digit=up.charAt(0)-'0';
        switch(ch){
            case '8':
                for(int i=(digit-2)*3+1;i<=((digit-1)*3);i++) {
                    char s=(char)('a'+i);
                    c=c+count(p+s,up.substring(1));
                }
                break;
            case '7':
                for(int i=(digit-2)*3;i<=((digit-1)*3);i++) {
                    char s=(char)('a'+i);
                    c=c+count(p+s,up.substring(1));
                }
                break;

            case '9':
                for(int i=(digit-2)*3+1;i<=((digit-1)*3)+1;i++) {
                    char s=(char)('a'+i);
                    c=c+count(p+s,up.substring(1));
                }
                break;
            default:
                for (int i = (digit - 2) * 3; i < ((digit - 1) * 3); i++) {
                    char s = (char) ('a' + i);
                    c=c+count(p + s, up.substring(1));
                }
        }
        return c;
    }
}
