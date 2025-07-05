package Video_questions.Recursion.Backtracking;

public class NKnights {
    public static void main(String[] args){
        int n=4;
        boolean[][] board=new boolean[n][n];
        Knight(board,0,0,4);
    }
    static void Knight(boolean[][] board, int row,int col,int target){
        if(target==0) {
            display(board);
            System.out.println();
            return ;
        }
        if(row==board.length-1&&col==board.length-1){
            return;
        }
         if(col==board.length){
             Knight(board,row+1,0,target);           //To avoid loops
             return;
         }
         if(isSafe(board,row,col)){
             board[row][col]=true;
             Knight(board,row,col+1,target-1);
             board[row][col]=false;
         }
        Knight(board,row,col+1,target);
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        if (isValid(board, row-1, col+2)) {
            if(board[row-1][col+2]){
                return false;
            }
        }
        if (isValid(board, row-1, col-2)) {
            if(board[row-1][col-2]){
                return false;
            }
        }
        if (isValid(board, row-2, col+1)) {
            if(board[row][col]){
                return false;
            }
        }
        if (isValid(board, row-2, col-1)) {
            if(board[row][col]){
                return false;
            }
        }

        return true;
    }
    static boolean isValid(boolean[][] board,int row,int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K");
                }else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
