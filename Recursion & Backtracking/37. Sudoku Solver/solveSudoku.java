import java.util.*;

class solveSudoku{
	public static void main(String[] args){
		char[][] board = {
				    {'5','3','.','.','7','.','.','.','.'},
				    {'6','.','.','1','9','5','.','.','.'},
				    {'.','9','8','.','.','.','.','6','.'},
				    {'8','.','.','.','6','.','.','.','3'},
				    {'4','.','.','8','.','3','.','.','1'},
				    {'7','.','.','.','2','.','.','.','6'},
				    {'.','6','.','.','.','.','2','8','.'},
				    {'.','.','.','4','1','9','.','.','5'},
				    {'.','.','.','.','8','.','.','7','9'}
				};

		sudokuSolver(board);

		for(char[] ch: board){
			System.out.print("helll world");
			System.out.println(Arrays.toString(ch));
		}

		

	}

	static boolean sudokuSolver(char[][] board){


		

		for(int i =0;i<9;i++){
			for(int j = 0;j<9;j++){
				if(board[i][j] == '.'){
					for(char ch = '1';ch<='9';ch++){
						if(isSafe(board, ch, i, j)){
							board[i][j] = ch;
							if(sudokuSolver(board)) return true;
							board[i][j] = '.';
						}
					}
					return false;
				}
			}
		}

		return true;


	}

	static boolean isSafe(char[][] board, char letter, int row, int col){

		// checking both row and column
		for(int i = 0;i<9;i++){
			if(board[row][i] == letter) return false;
		}

		for(int i = 0;i<9;i++){
			if(board[i][col] == letter) return false;
		}

		// checking 3x3 matrix

		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;

		for(int i = startRow;i<startRow+3;i++){
			for(int j = startCol;j<startCol+3;j++){
				if(board[i][j] == letter) return false;
			}
		}

	

		return true;

	}



}