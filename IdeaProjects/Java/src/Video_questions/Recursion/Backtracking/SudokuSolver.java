package Video_questions.Recursion.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
int[][] board={
        {3,0,6,5,0,8,4,0,0},
        {5,2,0,0,0,0,0,6,8},
        {0,8,7,0,0,9,0,3,1},
        {0,0,3,0,1,0,0,8,0},
        {9,0,4,8,6,3,0,0,5},
        {0,5,0,0,9,0,6,0,0},
        {1,3,0,0,0,0,2,5,0},
        {0,0,0,0,0,0,0,7,4},
        {0,4,5,2,0,6,3,0,0}
};
        System.out.println(solve(board));
    }
    static boolean solve(int[][] board){
        int n= board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for (int i = 0; i <n ; i++) {
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
        }
        for (int number = 1; number <=9 ; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if(solve(board)){
                    display(board);
                    return true;
                }else{
                    board[row][col]=0;   //backtrack
                }
            }
        }
        return false;
    }
    static void display(int[][] board){
        for(int[] row:board){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        // Column check (keep one only)
        int n=board.length;
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

// Row check
        for (int j = 0; j < n; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

           int sqrt=(int)Math.sqrt(board.length);
           int rowStart=row-row%sqrt;
           int colStart=col-col%sqrt;
           for(int r=rowStart;r<rowStart+sqrt;r++){
               for(int c=colStart;c<colStart+sqrt;c++){
                   if(board[r][c]==num){
                       return false;
                   }
               }
           }
return true;
    }
}
