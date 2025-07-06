package Video_questions.Strings;

public class Prefix {
    public static void main(String[] args) {
String a="abcdef";
String b="";
        System.out.println(prefix(a,b));
    }
    static boolean prefix(String a,String b){
        if(b.length()==0){
            return false;
        }
        while(!b.isEmpty()) {
            if (a.charAt(0) != b.charAt(0)) {
                return false;
            }
           a= a.substring(1);
           b= b.substring(1);
        }
        return true;
    }
}
