
package module9;

public class NQueens {
   static int count = 0;

    public static void main(String[] args) {

        int n = 4;

        int[][] board = new int[n][n];

        solve(board,0,n);

        System.out.println("Solutions: "+count);
    }

    static void solve(int[][] board,int row,int n){

        if(row==n){
            count++;
            return;
        }

        for(int col=0;col<n;col++){

            if(isSafe(board,row,col,n)){

                board[row][col]=1;

                solve(board,row+1,n);

                board[row][col]=0;
            }
        }
    }

    static boolean isSafe(int[][] board,int r,int c,int n){

        for(int i=0;i<r;i++)
            if(board[i][c]==1)
                return false;

        return true;
    }
}

