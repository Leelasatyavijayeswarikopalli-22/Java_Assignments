package Video_questions.Patterns;
//    *
//   * *
//  * * *
// * * * *                                   //follow spaces carefully
//* * * * *
// * * * *
//  * * *
//   * *
//    *
public class Q28 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row < 2*n; row++) {
          int totalcolsinrow=row>n?2*n-row:row;
          int noofspaces=n-totalcolsinrow;
            for (int i = 0; i <noofspaces ; i++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols <totalcolsinrow ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
