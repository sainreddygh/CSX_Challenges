package Challenges;

public class MinesWeeper {
	public static char[][] updateBoard(char[][] board, int[] click) {
	    if(board[click[0]][click[1]] == 'M'){
	        board[click[0]][click[1]] = 'X';
	        return board;
	    }
	    if(board[click[0]][click[1]] == 'E'){
	        revealAdjacent(board, click);
	    }
	    return board;
	}
	
	public static void revealAdjacent(char[][] board, int[] reveal){
	    int adjCount = 0;
	    for(int i = Math.max(0, reveal[0]-1); i<Math.min(board.length, reveal[0]+1); i++){
	        for(int j = Math.max(0, reveal[1]-1); j<Math.min(board[i].length, reveal[1]+1); j++){
	            if(board[i][j] == 'M') adjCount++;
	        }
	    }
	    if(adjCount>0){
	        board[reveal[0]][reveal[1]] = (char) adjCount;
	    }else {
	        for(int i = Math.max(0, reveal[0]-1); i<Math.min(board.length, reveal[0]+1); i++){
	            for(int j = Math.max(0, reveal[1]-1); j<Math.min(board[i].length, reveal[1]+1); j++){
	                if(i == reveal[0] && j == reveal[j])continue;
	                revealAdjacent(board, new int[]{i,j});
	            }
	        }
	    }
	}

}
