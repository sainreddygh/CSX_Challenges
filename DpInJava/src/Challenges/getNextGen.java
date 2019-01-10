package Challenges;

public class getNextGen {
	public static void gameOfLife(int[][] board) {
        int m = board.length,
            n = board[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int nc = getNeighbors(i, j, board);
                if(nc<2 && board[i][j]==1){
                    board[i][j]=2;
                }else if(nc>=2 && nc<4 && board[i][j]==1){
                    board[i][j] = 3;
                }else if(nc>3 && board[i][j]==1){
                    board[i][j]=2;
                }else if(nc == 3 && board[i][j]==0){
                    board[i][j]=1;
                }
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                board[i][j]>>=1;
            }
        }
    }
    public static int getNeighbors(int i, int j, int[][] board){
        int result = ((i>0 && j>0) ? (board[i-1][j-1]<<1)/2: 0)
            + (i>0 ? (board[i-1][j]<<1)/2 : 0)
            + ((i>0 && j<board[i].length-1) ? (board[i-1][j+1]<<1)/2 : 0)
            + (j>0 ? (board[i][j-1]<<1)/2 : 0)
            + (j<board[i].length-1 ? (board[i][j+1]<<1)/2 : 0)
            + ((i<board.length-1 && j>0) ? (board[i+1][j-1]<<1)/2 : 0)
            + (i<board.length-1 ? (board[i+1][j]<<1)/2 : 0)
            + ((i<board.length-1 && j<board[i].length-1) ? (board[i+1][j+1]<<1)/2 : 0);
        return result;        
    }

}
