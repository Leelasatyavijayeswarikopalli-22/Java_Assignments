package Video_questions.Recursion;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String str = "vijee";
       sub("", str);
        System.out.println(sub2("",str));
    }

    static void sub(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p + ch, up.substring(1));
        sub(p, up.substring(1));
        sub(p+(ch+0),up.substring(1));
    }

    //ArrayList of subsequences

    static ArrayList<String> sub2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans1 = sub2(p + ch, up.substring(1));
        ArrayList<String> ans2 = sub2(p, up.substring(1));
        ArrayList<String> ans3= sub2(p+(ch+0),up.substring(1));
        ans2.addAll(ans1);
        ans2.addAll(ans3);
        return ans2;
    }

}