package Video_questions.conditions_loops;

public class Counting_Occurences {
    public static void main(String[] args) {
        long n=3783749749L;
        int count=0;
        while(n>0){
           long num= n%10;
           if(num==7){
               count++;
           }
           n=n/10;
        }
        System.out.println("No.of counts are "+count);
    }
}
