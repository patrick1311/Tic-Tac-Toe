import java.util.Scanner;
import java.util.Random;

public class TicTacToeMain {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		TicTacToe ttt = new TicTacToe();
		
		System.out.println("This is a simple Tic Tac Toe game. Player 1 is X and player 2 is O by default.\n");
		
		char choice;
		int player = rnd.nextInt(2) + 1;	//generate 1 or 2
		System.out.println("Player " + player + " goes first!");
		ttt.symbolChange(player);
			
		ttt.printBoard();
		
		while(!ttt.isWin() && !ttt.isFull())
		{
			System.out.print("Enter your choice: ");
			choice = in.next().charAt(0);	//read first char from the string in scanner
			
			//check validity of user choice
			if(ttt.isEmpty(choice))
			{
				ttt.playerMove(choice);
				ttt.printBoard();
				
				//switch turn
				if(player == 1)
					player = 2;
				else
					player = 1;
				
				ttt.symbolChange(player);
			}
			else
			{
				System.out.println("Invalid choice! Choose again!");
			}
			
		}
		
		if(ttt.isWin())
			System.out.println("We have a winner!");
		else
			System.out.println("No one win.");
		
		in.close();
	}
}
