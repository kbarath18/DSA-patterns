import java.util.*;


class solveNQueens{
	public static void main(String[] args){
		int n = 4;
		
		char[][] board = new char[n][n];

		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board.length;j++)
				board[i][j] = '.';
		}

		List<List<String>> ans = new ArrayList<>();
		solveNQueens(0, board, ans);

		System.out.print((ans));

	}

	static void solveNQueens(int row, char[][] board, List<List<String>> ans) {
        if(row == board.length){
        	List<String> res = new ArrayList<>();
		    for (char[] b : board) {
		        res.add(new String(b));
		    }

		    ans.add(new ArrayList<>(res));
		    return;
        }

        for(int col = 0;col<board.length;col++){
        	if(isSafe(board, row, col)){
        		board[row][col] = 'Q';
        		solveNQueens(row+1, board, ans);
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