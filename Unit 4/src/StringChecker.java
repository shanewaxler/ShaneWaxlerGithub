//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		

	}

	public StringChecker(String s)
	{
		word = s;

	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		char c1 = (char) word.indexOf(c);
		char cstring = word.charAt(c1);
		if (cstring == c){
			return true;
		}


		return false;
	}

	public boolean findSubString(String s)
	{
		int length = s.length();
		
		if (word.indexOf(s) != -1){
			return true;
		}
		return false;
	}

 	public String toString()
 	{
 		return word;
	}
}