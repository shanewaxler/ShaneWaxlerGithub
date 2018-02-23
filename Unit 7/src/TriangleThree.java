//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle(letter,size);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
		String triangle = "";
		for (int i = 0;i<= size; i++){
			triangle = triangle
		}
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}