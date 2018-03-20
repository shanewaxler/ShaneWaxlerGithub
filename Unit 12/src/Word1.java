//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class Word1 implements Comparable<Word1>
{
	private String word;

	public Word1( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		Scanner vowel = new Scanner(vowels);
		Scanner wordy = new Scanner(word);
		for (int i = 0; i<word.length(); i++){
			for (int j = 0; j<vowels.length();j++){
				if (vowel.next().charAt(j)==wordy.next().charAt(i)){
					vowelCount++;
				}
			}
		}






		return vowelCount;
	}
	
	public int compareTo(Word1 rhs)
	{
		if (rhs.numVowels() > numVowels()){
			return 1;
		}
		return -1;
	}

	public String toString()
	{
		return word;
	}
}