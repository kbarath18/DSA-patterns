

class totalNQueens{
	static int totalQ = 0;
	public static void main(String[] args){
		int n = 4;
		totalQ = 0;
        char[][] board = new char[n][n];

		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board.length;j++)
				board[i][j] = '.';
		}

		solveNQueens(0, board); 
        System.out.print(totalQ);
	}

	static void solveNQueens(int row, char[][] board) {
        if(row == board.length){
        	totalQ++;
		    return;
        }

        for(int col = 0;col<board.length;col++){
        	if(isSafe(board, row, col)){
        		board[row][col] = 'Q';
        		solveNQueens(row+1, board);
        		board[row][col] = '.';
        	}
        }
    }

    static boolean isSafe(char[][] board, int row, int col){
    	// -------- line

    	for(int i = 0;i<board.length;i++){
    		if(board[row][i] == 'Q') return false;
    	}

    	for(int i = 0;i<board.length;i++){
    		if(board[i][col] == 'Q') return false;
    	}

    	
    	int r = row-1;
    	int c = col-1;

    	while(r >=0 && c>=0){
    		if(board[r][c] == 'Q') return false;
    		r--;
    		c--;
    	}


    	r = row-1;
    	c = col+1;

    	while(r>=0 && c<=board.length-1){
    		if(board[r][c] == 'Q') return false;
    		r--;
    		c++;
    	}


    	// end of the line
    	return true;
    }
}