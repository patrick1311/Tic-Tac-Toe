
public class TicTacToe {
	private char board[][] = new char[][]{
			{'1','2','3'},
			{'4','5','6'},
			{'7','8','9'}
			};
	private char symbol;
	
	public void printBoard()
	{
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("---|---|---");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("---|---|---");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	
	public void symbolChange(int x)
	{
		if(x == 1)
			symbol = 'X';
		else
			symbol = 'O';
	}
	
	//set player's choice to X or O
	public void playerMove(char x)
	{
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
			{
				if(x == board[i][j])
					board[i][j] = symbol;
			}
	}
	
	//check board whether it is all filled
	public boolean isFull()
	{
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
			{
				if(board[i][j] != 'X' && board[i][j] != 'O')
					return false;
			}
		return true;
	}
	
	//check win condition
	public boolean isWin()
	{
		if(checkRow() == true || checkColumn() == true || checkDiagonal() == true)
			return true;
		else
			return false;
	}
	
	public boolean checkRow()
	{
		for(int i = 0; i < 3; i++)
		{
			if(board[i][0] == board[i][1] && board[i][0] == board[i][2])
				return true;
		}
		return false;	
	}
	
	public boolean checkColumn()
	{
		for(int i = 0; i < 3; i++)
		{
			if(board[0][i] == board[1][i] && board[0][i] == board[2][i])
				return true;
		}
		return false;	
	}
	
	public boolean checkDiagonal()
	{
		if((board[0][0] == board[1][1] && board[0][0] == board[2][2])
			|| (board[0][2] == board[1][1] && board[0][2] == board[2][0]))
			return true;
		return false;
	}
	
	//check whether the choice is empty or chosen
	public boolean isEmpty(char x)
	{
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
			{
				if(x == board[i][j])
				{
					if(board[i][j] != 'X' && board[i][j] != 'O')
						return true;
				}
			}
		return false;
	}
}
