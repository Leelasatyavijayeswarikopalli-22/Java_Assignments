package Video_questions.Strings;

public class Prefix {
    public static void main(String[] args) {
String a="abcdef";
String b="abc";
        System.out.println(prefix(a,b));
    }
    static boolean prefix(String a,String b){
        int c=0;
        for (int i = 0; i <a.length() ; i++) {
         if(a.charAt(i)==b.charAt(i)){
             c++;
         }
         if(c>0){
             return true;
         }
        }
        return false;
    }
}
