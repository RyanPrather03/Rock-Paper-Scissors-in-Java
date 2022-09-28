import java.util.Random;
import java.util.Scanner;

public class App {
  public static void main(String[]args) {

	Scanner scanner = new Scanner (System.in);

	//creating the loop so game goes until user does not enter "yes"//
    while (true) {
    String[]rps ={"rock", "paper", "scissors"};

	//Randomize computer move//
    String computerMove = rps[new Random ().nextInt (rps.length)];
    
    String playerMove;

    while (true)
      {
	System.out.println ("Welcome to Rock Paper Scissors! Please enter your move (rock, paper, or scissors)");
	playerMove = scanner.nextLine ();

	//Choosing the player's move//
	if (playerMove.equals ("rock") || playerMove.equals ("paper")
	    || playerMove.equals ("scissors"))
	  {
	    break;
	  }

	  //if player enters something that is NOT, "rock, paper, or scissors", states not a valid move and presents a retry//
	System.out.println (playerMove + " is not a valid move.");
      }

    System.out.println ("Computer Played: " + computerMove);

    if (playerMove.equals (computerMove))
      {
	System.out.println ("The game was a tie!");
      }

    //If Rock is Chosen by User//
    
	else if (playerMove.equals ("rock"))
      {
	if (computerMove.equals ("paper"))
	  {
	    System.out.println ("You Lost! Better luck next time.");
	  }
	else if (computerMove.equals ("scissors"))
	  {
	    System.out.println ("You Won! Your Rock smashed their Scissors!");
	  }
      }

    //If Paper is Chosen by User//

    else if (playerMove.equals ("paper"))
      {
	if (computerMove.equals ("rock"))
	  {
	    System.out.println ("You Won! Your Paper covered their rock!");
	  }
	else if (computerMove.equals ("scissors"))
	  {
	    System.out.println ("You Lost! Better luck next time.");
	  }
    }

    //If Scissors is chosen by User//

    else if (playerMove.equals ("scissors"))
      {
	if (computerMove.equals ("paper"))
	  {
	    System.out.println ("You Won! Your Scissors cut up their paper!");
	  }
	else if (computerMove.equals ("rock"))
	  {
	    System.out.println ("You Lost! Better luck next time.");
	  }
	  
    }
	System.out.println("Play Again? (yes/no)");
	String playAgain = scanner.nextLine();

	if (!playAgain.equals("yes")) {
		break;
	}
	
  }
  scanner.close();
}
}