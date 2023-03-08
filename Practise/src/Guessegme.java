import java.util.*;
class Gusser{
	 int guess;
	 int guess(){
		 Scanner scan=new Scanner (System.in);
		 System.out.println("hey,Guesser kindly gguess the number ");
		  guess=scan.nextInt();
		 return guess();
		 
	 }
	
}
 class Players{
	 int guess;
	 int guess() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Player guess the numbers");
		 guess=scan.nextInt();
		 return guess;
	 }
 }
  
  class Umpires{
	  int numFromGusser;
	  int numFromPlayer1;
	  int numFromPlayer2;
	  int numFromPlayer3;
	 
	  void CollectNumFromGusser()
	  {
		  Gusser g=new Gusser();
		  numFromGusser=g.guess();
	  }
	   
	  void CollectNumFromPlayers()
	  {
		  Players P1 =new Players();
		  Players P2 =new Players();
		  Players P3 =new Players();
		  
		  numFromPlayer1=P1.guess();
		   numFromPlayer2=P2.guess();
		  numFromPlayer3=P3.guess(); 
	  }  
	   
	  void Compare()
	  {    //If PLayer1 won the game 
		  if(numFromGusser==numFromPlayer1)
		  {
			  System.out.println("Player 1 won the game");
		  }
		  //If PLayer2 won the game
		  else if(numFromGusser==numFromPlayer2)
		  {
			  System.out.println("Player2 won the game ");
		  }
		//If PLayer3 won the game
		  else if(numFromGusser==numFromPlayer3)
		  {
			  System.out.println("Player3 won the game ");
		  }
		//If No one  won the game
		  else
		  {
			  System.out.println("no one won the game");
		  }
	  }
	  
	  
  }
public class Guessegme {

	public static void main(String[] args) {
		// Let's Play the game by calling all  methods
		Umpires U=new Umpires();
		U.CollectNumFromGusser();
		U.CollectNumFromPlayers();
		U.Compare();
		
	}

}
