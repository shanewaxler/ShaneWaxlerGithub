//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private int first;
   private int second;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if (atCount == 0){
			first = r;
			second = c;
		}
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if (r>=0 && c>=0 && c<10 && r<10 && atMat[r][c]== '@'){
			atCount+=1;
			atMat[r][c]= 'x';
		}
		else if (r<0 || c<0 || c>=10 || r>=10 || atMat[r][c]!= '@'){
			return 0;
		}
		return atCount +countAts(r+1,c) +countAts(r,c+1)+countAts(r+1,c+1)+countAts(r-1,c)+countAts(r,c-1);
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="" + first + " " + second + " has ";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}