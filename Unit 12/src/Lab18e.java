//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<String> bop = new ArrayList<String>();
		
		Scanner scan = new Scanner(new File("C:\\Users\\waxlers3186\\Desktop\\ShaneWaxlerGithub\\Unit 12\\src\\lab18e.dat"));
		int num = scan.nextInt();
		while(scan.hasNextLine()){
			bop.add(scan.nextLine());
		}
		
		for (int i = 0; i<num;i++){
			for (int j = 0; j<i;j++){
				
				if (bop.get(i).compareTo(bop.get(j))==1){
					
					String doop = bop.get(i);
					String wink = bop.get(j);
					bop.set(j, wink);
					bop.set(i, doop);
				}
				
			}
		}
		
		for(int i = 0; i < bop.size(); i++)
		{
			out.println(bop.get(i));
		}









	}
}