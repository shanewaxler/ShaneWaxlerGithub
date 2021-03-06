//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private ArrayList<Character> bubble;
	private String fileName;

	public Histogram()
	{



	}

	public Histogram(char[] values, String fName)
	{
		fileName = fName;
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		for (int i = 0; i<values.length;i++){
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		bubble = new ArrayList<Character>();
		Scanner blop = new Scanner(new File(fileName));
		//blop.nextInt();
		//blop.nextLine();
		while (blop.hasNext()){
			String shwinky = blop.next();
			for (int i = 0; i<shwinky.length();i++){
				bubble.add(shwinky.charAt(i));
			}
		}


	}

	public char mostFrequent()
	{
		for (int i = 0; i<bubble.size();i++){
			for(int j = 0; j<letters.size();j++){
				if (bubble.get(i) == letters.get(j)){
					count.set(j,count.get(j)+1);
				}
			}
		}
		int biggest = 0;
		int index = 0;
		for (int i = 0; i<count.size();i++){
			if (count.get(i)>biggest){
				biggest = count.get(i);
				index = i;
			}
		}
		return letters.get(index);
	}

	public char leastFrequent()
	{
		int smallest = 15;
		int index = 10;
		for (int i = 0; i<count.size();i++){
			if (count.get(i)<smallest){
				smallest = count.get(i);
				index = i;
			}
		}

		return letters.get(index);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}