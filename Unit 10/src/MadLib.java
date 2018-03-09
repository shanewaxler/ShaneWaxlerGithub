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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new  ArrayList<String>();



	}

	public MadLib(String fileName)
	{
		this();		
		loadNouns();
		loadAdjectives();
		loadVerbs();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String thing = file.next();
				if (thing.equals("#")){
					System.out.print(getRandomNoun() + " ");
				}
				else if(thing.equals("@")){
					System.out.print(getRandomVerb() + " ");
				}
				else if(thing.equals("&")){
					System.out.print(getRandomAdjective()+ " ");
				}
				else{
					System.out.print(thing + " ");
				}
				
			}
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		    Scanner scan = new Scanner(new File("C:\\Users\\waxlers3186\\Desktop\\ShaneWaxlerGithub\\Unit 10\\src\\nouns.dat"));
		    while(scan.hasNext()){
			    nouns.add(scan.next());
			
		}
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
		
	}
	
	public void loadVerbs()
	{
		try{
		Scanner scan = new Scanner(new File("C:\\Users\\waxlers3186\\Desktop\\ShaneWaxlerGithub\\Unit 10\\src\\verbs.dat"));
		while(scan.hasNext()){
			verbs.add(scan.next());
		}
	
	
	
	
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void loadAdjectives()
	{
		try{
		Scanner scan = new Scanner(new File("C:\\Users\\waxlers3186\\Desktop\\ShaneWaxlerGithub\\Unit 10\\src\\adjectives.dat"));
		while(scan.hasNext()){
			adjectives.add(scan.next());
		}
	
	
	
	
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public String getRandomVerb()
	{
		int random = (int)(Math.random()*verbs.size());
		return verbs.get(random);
	}
	
	public String getRandomNoun()
	{
		int random = (int)(Math.random()*nouns.size());
		return nouns.get(random);
	}
	
	public String getRandomAdjective()
	{
		int random = (int)(Math.random()*adjectives.size());
		return adjectives.get(random);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}
