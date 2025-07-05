package Video_questions.Recursion;
//Amazon
import java.util.ArrayList;
public class NoOfDiceRollsWithTarget {
    public static void main(String[] args) {
        possibilities(4,"");
        System.out.println(p(4,""));
    }
    static void possibilities(int target,String p){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6&&i<=target ; i++) {
           possibilities(target-i,p+i);
        }
        }
        //return list
    static ArrayList<String> p(int target,String p){
        if(target==0){
            ArrayList<String> List=new ArrayList<String>();
            List.add(p);
            return List;
        }
        ArrayList<String> List=new ArrayList<String>();
        for (int i = 1; i <=6&&i<=target ; i++) {
           List.addAll(p(target-i,p+i));
        }
        return List;
    }
    }
