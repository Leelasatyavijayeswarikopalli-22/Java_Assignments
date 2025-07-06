package Video_questions.Patterns;
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5
public class Q30 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print("  ");
                }
                if (i >= 2) {
                    for (int j = i; j >= 2; j--) {
                        System.out.print(j+" ");
                    }
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
            System.out.println();
            }
        }
    }

