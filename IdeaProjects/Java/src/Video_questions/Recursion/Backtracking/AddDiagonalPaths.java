package Video_questions.Recursion.Backtracking;

public class AddDiagonalPaths {
    public static void main(String[] args) {
        pathDia("", 3, 3);
    }

    static void pathDia(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            pathDia(p + "D", r - 1, c);
        }
        if (c > 1) {
            pathDia(p + "R", r, c - 1);
        }
        if(r>1&&c>1){
            pathDia(p+"d",r-1,c-1);
        }
    }
}
