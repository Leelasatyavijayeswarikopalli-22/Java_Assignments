package Video_questions.Strings;
//Print Substrings that are only prefix
public class Q {
    public static void main(String[] args) {
        String a="abcdef";
        String b="abc";
        System.out.println(prefix(a,b));
    }
    static String prefix(String a,String b){
        int c=0;
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)==b.charAt(i)){
                c++;
                if(c>0){
                    return a.substring(i,c);
                }
            }
        }
        return null;
    }
}

