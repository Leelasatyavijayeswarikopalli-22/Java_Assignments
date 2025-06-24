package Video_questions.BItwiseOperators_NumberSystem;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        int n=20;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <n ; i++) {
            if(n%i==0) {
                if(n/i==i){
                    System.out.println(i+" ");
                }
                    System.out.println(i + " ");
                    list.add(n / i);
                }
            }
        for (int i =list.size()-1 ; i >=0 ; i--) {
            System.out.println(list.get(i)+" ");
        }
    }
}
