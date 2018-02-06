//© A+ Computer Science  -  www.apluscompsci.com
//Name Shane Waxler
//Date 2/6/18
//Class APCS
//Lab  02E

import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
	}

	public void calculateArea(double radius)
	{
		area = (Math.PI)*(Math.pow(radius, 2));
	}

	public void print( )
	{
		System.out.println("The area is: " + area);
	}
}