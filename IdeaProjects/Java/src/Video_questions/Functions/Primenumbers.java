package Video_questions.Functions;

public class Primenumbers {
    public static void main(String[] args) {
        int n=19;
        for (int i =2; i <=n ; i++) {
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }
    static boolean prime(int n){
        int c=2;
        while(c*c<=n){
           if(n%c==0){
             return false;
           }
           c++;
        }
        return true;
    }
}
