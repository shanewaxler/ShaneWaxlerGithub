//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("C:\\Users\\waxlers3186\\Desktop\\ShaneWaxlerGithub\\Unit 14\\src\\lab21i.dat"));
		int size = scan.nextInt();
		scan.nextLine();
		size = scan.nextInt();
		Maze m1 = new Maze(size,scan.nextLine());
		m1.hasExitPath(0,0);
		out.println(m1);
	}
}