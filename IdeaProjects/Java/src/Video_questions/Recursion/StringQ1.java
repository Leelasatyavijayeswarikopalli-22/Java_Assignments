package Video_questions.Recursion;
//Given a string ,and you have to show another string that has no A's
public class StringQ1 {
    public static void main(String[] args) {
        String str="babcadaabcd";
        String original=str.toLowerCase();
        System.out.println(New1(original,0));
        System.out.println(New2(original,0));
        System.out.println(New3(original,0));
    }
    static   String New="";
    static String New1(String original,int i){
        if(i==original.length()) {
            return New;
        }
        if(original.charAt(i)!='a'){
            New+=original.charAt(i);
        }
        return New1(original,i+1);
    }
    static String New2(String original,int i){
        String New2="";
        if(i==original.length()) {
            return New2;
        }
        if(original.charAt(i)!='a'){
            New2+=original.charAt(i);
        }
        return New2+New2(original,i+1);
    }
    //Skip a String
    static String New3(String original,int i){
        if(i==original.length()) {
            return "";
        }
        if(i+3<original.length()&&original.substring(i,i+3).equals("abc")){
           return New3(original,i+3);
        }else{
            return original.charAt(i)+New3(original,i+1);
        }
    }
}
