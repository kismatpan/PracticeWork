import java.util.*;
class Guesser{
	int guess;
	 int guess()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println(" Guesser Kindly Guess the Number");
		guess=scan.nextInt();
		return guess;
	}
}
 
class Player{
	int guess;
	int guess() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player guess the no");
		guess=scan.nextInt();
		return guess;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	
	void CollectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guess();
	}
	void CollectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		
		numFromPlayer1 = p1.guess();
		numFromPlayer2 =  p2.guess();
	}
	void Compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player 1 won the game ");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player 2 won the game");
		}
		else
		{
			System.out.println("you loss the game");
		}
	}
	
}
public class GuesserGame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.CollectNumFromGuesser();
		u.CollectNumFromPlayer();
		u.Compare();

	}

}
