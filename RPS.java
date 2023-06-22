package rockpaperscissors;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rounds of RPS would you like to play?");
		int rounds = scan.nextInt();
		
		int player1Choice = 0;
		int player1Wins = 0;
		
		// main round loop
		for (int i = 0; i < rounds; i++)
		{
			// player 1 choice cycle
			if (player1Choice == 3)
			{
				player1Choice = 0;
			}
			else
			{
				player1Choice++;
			}
			
			// random player 2 choice of either 0, 1, or 2
			int player2Choice = (int)(Math.random() * 3);
			
			// checking for wins
			for (int j = 0; j < 3; j ++)
			{
				if (player1Choice == j + 1 && player2Choice == j)
				{
					player1Wins++;
				}
			}
			if (player1Choice == 0 && player2Choice == 2)
			{
				player1Wins++;
			}
			
		}
		
		int player2Wins = rounds - player1Wins;
		
		System.out.println("Player 1 won " + ((double)player1Wins/rounds)*100 + "% of the time");
		System.out.println("Player 2 won " + ((double)player2Wins/rounds)*100 + "% of the time");

	}

}
