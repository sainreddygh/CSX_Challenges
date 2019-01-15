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
	    for(int i = Math.max(0, reveal[0]-1); i<Math.min(board.length, reveal[0]+2); i++){
	        for(int j = Math.max(0, reveal[1]-1); j<Math.min(board[i].length, reveal[1]+2); j++){
	            if(board[i][j] == 'M') adjCount++;
	        }
	    }
	    if(adjCount>0){
	        board[reveal[0]][reveal[1]] = (char) adjCount;
	    }else {
	    	//System.out.println("Updating ["+reveal[0]+"]["+reveal[1]+"]");
            board[reveal[0]][reveal[1]] = 'B';
	        for(int i = Math.max(0, reveal[0]-1); i<Math.min(board.length, reveal[0]+2); i++){
	            for(int j = Math.max(0, reveal[1]-1); j<Math.min(board[i].length, reveal[1]+2); j++){
	            	//System.out.println("Checking ["+i+"]["+j+"]");
	                if(board[i][j] == 'E') {
	                	//System.out.println("Iterating ["+i+"]["+j+"]");
	                	revealAdjacent(board, new int[]{i,j});
	                }
	            }
	        }
	    }
	}

}
