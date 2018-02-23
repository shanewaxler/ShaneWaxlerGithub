//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		int guess = 0;
		Scanner keyboard = new Scanner(System.in);
		int randy =(int) (Math.random()*upperBound+1);
		int count = 0;
		do{
			System.out.println("Guess a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			if ((guess < 1) || (guess > upperBound)){
				System.out.println("Number is out of range!");
			}
			count+=1;
		}while (randy != guess);
		System.out.println("\nIt took " + count + " guesses to get " + randy);
		System.out.println("You guessed wrong " + (1.0/count)*100.0 + " percent of the time\n\n");
		
		



	}

	public String toString()
	{
		String output="";
		return output;
	}
}