package Video_questions.Patterns;
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
        for(int i=1;i<2*n;i++){
            if(i<=4) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                if (i >= 2) {
                    for (int j = i; j >= 2; j--) {
                        System.out.print(j);
                    }
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }else {
                for (int j = n; j <i; j++) {
                    System.out.print(" ");
                }
                if (i<2*n-1) {
                    for (int j = 2*n-i; j >=2; j--) {
                        System.out.print(j);
                    }
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
