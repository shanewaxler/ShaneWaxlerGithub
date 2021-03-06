//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean end = false;

	public Maze()
	{
		
		
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		int count = 0;
		for (int i = 0; i<size;i++){
			for(int j = 0;j<size;j++){
				if (line.charAt(count)=='1'){
					maze[i][j] = 1;
				}
				else{
					maze[i][j] = 0;
				}
				count++;
			}
		}

	}

	public void hasExitPath(int r, int c)
	{
		if (maze[r][c]==0){
			System.out.print("");
		}
		else{
			if (c == 5){
				end = true;
			}
			else{
				maze[r][c] = 0;
				hasExitPath(r+1,c);
				hasExitPath(r,c+1);
				if (r>0){
					hasExitPath(r-1,c);
				}
				if (c>0){
					hasExitPath(r,c-1);
				}
			}
		}
	}

	public String toString()
	{
		String output = "";
		if (end){
			output = "You win";
		}
		else{
			output="You lose";
		}
	
		return output;
	}
}