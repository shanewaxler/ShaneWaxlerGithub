//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = ' ';
		do{
			
			System.out.println("How many numbers?");
			int answer = keyboard.nextInt();
			GuessingGame s = new GuessingGame(answer);
			s.playGame();
			System.out.println("Do you want to play again");


		}while (response == 'y');
		
		




	}
}