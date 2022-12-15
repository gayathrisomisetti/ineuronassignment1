package assignment2;
import java.util.Scanner;

class guesser{
	int guessNum;
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("GUESSER ,please! guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}	
}

class player{
	int guesspnum;
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLAYER ,please! guess the number");
		 guesspnum=sc.nextInt();
		return guesspnum;
	}
}


class umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	public void collectNumFromGuesser()
	{
		guesser g = new guesser();
		numFromGuesser = g.guessNumber();
	
	}
	public void collectNumFromPlayer()
	{
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();
		player p4 = new player();
		
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
		numFromPlayer4 = p4.guessNumber();
	}
	
	
	void compare()
	{
		if(numFromGuesser == numFromPlayer1) 
		{
			if((numFromGuesser == numFromPlayer2 ) && (numFromGuesser == numFromPlayer3) && (numFromGuesser == numFromPlayer4))
			{
				System.out.println("all players won the game");
				System.out.println("player1 : 10 points");
				System.out.println("player2 : 10 points");
				System.out.println("player3 : 10 points");
				System.out.println("player4 : 10 points");
			}
			else if (numFromGuesser == numFromPlayer2)
			{
				System.out.println("player1 and player2 won the game");
				System.out.println("player1 : 10 points");
				System.out.println("player2 : 10 points");
				System.out.println("player3 : 0 points");
				System.out.println("player4 : 0 points");

			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("player1 and player3 won the game");
				System.out.println("player1 : 10 points");
				System.out.println("player2 : 0 points");
				System.out.println("player3 : 10 points");
				System.out.println("player4 : 0 points");

			}
			else if (numFromGuesser == numFromPlayer4)
			{
				System.out.println("player1 and player4 won the game");
				System.out.println("player1 : 10 points");
				System.out.println("player2 : 0 points");
				System.out.println("player3 : 0 points");
				System.out.println("player4 : 10 points");

			
			}
			else
			{
			System.out.println("player1 won the game");
			System.out.println("player1 : 10 points");
			System.out.println("player2 : 0 points");
			System.out.println("player3 : 0 points");
			System.out.println("player4 : 0 points");

			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("player2 and player3 won the game");
				System.out.println("player1 : 0 points");
				System.out.println("player2 : 10 points");
				System.out.println("player3 : 10 points");
				System.out.println("player4 : 0 points");

			}
			else if(numFromGuesser == numFromPlayer4)
			{
				System.out.println("player2 and player 4 won the game");
				System.out.println("player1 : 0 points");
				System.out.println("player2 : 10 points");
				System.out.println("player3 : 0 points");
				System.out.println("player4 : 10 points");
			}
			else {
			System.out.println("player2 won the game");
			System.out.println("player1 : 0 points");
			System.out.println("player2 : 10 points");
			System.out.println("player3 : 0 points");
			System.out.println("player4 : 0 points");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			if(numFromGuesser == numFromPlayer4) 
			{
			    System.out.println("player3  and player4 won the game");
			    System.out.println("player1 : 0 points");
			    System.out.println("player2 : 0 points");
			    System.out.println("player3 : 10 points");
			    System.out.println("player4 : 10 points");
			}
			else
			{
				System.out.println("player3 won the game");
				System.out.println("player1 : 0 points");
				System.out.println("player2 : 0 points");
				System.out.println("player3 : 10 points");
				System.out.println("player4 : 0 points");
				
			}
		}
		else if (numFromGuesser == numFromPlayer4)
		{
			System.out.println("player4 won the game");
			System.out.println("player1 : 0 points");
			System.out.println("player2 : 0 points");
			System.out.println("player3 : 0 points");
			System.out.println("player4 : 10 points");
		}
		else
		{
			System.out.println("player1 : 0 points");
			System.out.println("player2 : 0 points");
			System.out.println("player3 : 0 points");
			System.out.println("player4 : 0 points");
			System.out.println("game lost!! try again");
		}
     }
}
public class guesserGameProject{

	public static void main(String[] args) {
		umpire u = new umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
		
	}

}
