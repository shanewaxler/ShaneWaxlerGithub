//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{


	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;

	}

	public void calcDistance()
	{
		distance = Math.pow(Math.pow(xTwo - xOne, 2)+Math.pow(yTwo - yOne, 2),0.5);
		


	}

	public void print( )
	{

		System.out.println("Enter X1 :: " + xOne);
		System.out.println("Enter Y1 :: " + yOne);
		System.out.println("Enter X2 :: " + xTwo);
		System.out.println("Enter Y2 :: " + yTwo);
		System.out.println("Distance == " + distance);

	}
}