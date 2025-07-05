package Video_questions.Recursion.Backtracking;

import java.util.ArrayList;

public class PrintingPaths {
    public static void main(String[] args) {
   path("",3,3);
        System.out.println( path1("",3,3));
    }
    static void path(String p,int r,int c){
     if(r==1&&c==1){
         System.out.println(p);
         return;
     }
     if(r>1){
         path(p+"D",r-1,c);
     }
     if(c>1){
         path(p+"R",r,c-1);
     }
    }
    //return an arraylist
    static ArrayList<String> path1(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }
        ArrayList<String> List=new ArrayList<>();
        if(r>1){
           List.addAll(path1(p+"D",r-1,c));
        }
        if(c>1){
            List.addAll(path1(p+"R",r,c-1));
        }
        return List;
    }

}
