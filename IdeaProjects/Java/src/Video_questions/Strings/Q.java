package Video_questions.Strings;
//Print Substrings that are only prefix
public class Q {
    public static void main(String[] args) {
        String a="abcdef";
        String b="ab9d4";
prefix(a,b);
    }
    static void prefix(String a,String b){
       if(b.isEmpty()){
           return ;
       }
       StringBuilder Build=new StringBuilder();
       while(!b.isEmpty()){
           if(a.charAt(0)==b.charAt(0)){
            Build.append(a.charAt(0));
           }else{
               break;
           }
           a=a.substring(1);
           b=b.substring(1);
       }
        System.out.println(Build);
    }
}

