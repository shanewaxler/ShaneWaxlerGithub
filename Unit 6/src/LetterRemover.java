//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence,lookFor);
	}
	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while (cleaned.indexOf(lookFor) > -1){
			if (cleaned.indexOf(lookFor)==-1){
				break;
			}
			int windex = cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0, windex) + cleaned.substring(windex+1,cleaned.length());
		}



		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n"+ removeLetters();
	}
}