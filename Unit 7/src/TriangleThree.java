//� A+ Computer Science  -  www.apluscompsci.com
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
		setTriangle(0," ");
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(count,let);
		
	}

	public void setTriangle(int sz, String let)
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String triangle = "";
		for (int i = 0;i< size; i++){
			for(int j = 1; j< size - i;j++){
				triangle+=" ";
			}
			for(int k = 0; k< i+1;k++){
				triangle+= getLetter();
			}
			triangle+="\n";
		}
		return triangle + "\n";
	}
}