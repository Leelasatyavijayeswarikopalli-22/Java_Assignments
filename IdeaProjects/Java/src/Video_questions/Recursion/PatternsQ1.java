package Video_questions.Recursion;

public class PatternsQ1 {
    public static void main(String[] args) {
        int n=5;
       print(n,n,1);
        print2(n,1,1);
    }
    static void print(int n,int row,int col){
        if(row==0){
            return;
        }
        if(col<=row) {
            System.out.print("*");
            print(n, row, col+1);
        }else {
            System.out.println();
            print(n, row - 1, 1);
        }
    }
    static void print2(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col<=row) {
            System.out.print("*");
            print2(n, row, col+1);
        }else {
            System.out.println();
            print2(n, row+1, 1);
        }
    }
}
