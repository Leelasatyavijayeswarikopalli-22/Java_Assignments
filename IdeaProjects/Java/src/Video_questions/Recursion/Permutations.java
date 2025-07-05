package Video_questions.Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args){
        permutation("","abc");
      System.out.println(permute("","abc"));
        System.out.println(permutecount("","abc"));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+",");
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }
    //Arraylist
    static ArrayList<String> permute(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> List=new ArrayList<>();
           List.add(p);
            return List;
    }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permute(f+ch+s,up.substring(1)));
        }
return ans;
        }
        //Counting no.of permutations
        static int permutecount(String p,String up){
            if(up.isEmpty()){
                return 1;
            }
            int count=0;
            char ch=up.charAt(0);
            for(int i=0;i<=p.length();i++){
                String f=p.substring(0,i);
                String s=p.substring(i,p.length());
              count=count+permutecount(f+ch+s,up.substring(1));
            }
            return count;
        }
}
