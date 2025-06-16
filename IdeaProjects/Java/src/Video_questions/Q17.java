package Video_questions;
//                   1
//                  212
//                 32123
//                4321234
//                 32123
//                  212
//                   1
public class Q17 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <2*n; i++) {
            if(i<=n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j =i; j>=i ; j--) {
                    System.out.print(j+1);
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
            }else{
                for(int j=1;j<=i-n;j++){
                    System.out.print(" ");
                }

                for (int j =1; j<=2*n-i; j++) {
                    System.out.print(j);
                                    }
            }
            System.out.println();
        }
    }
}
