//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner scan = new Scanner(gradeList);
		int size = scan.nextInt();
		String sub = "" + size;
		String inp = gradeList.substring(sub.length() + 3);
		scan = new Scanner(inp);
		int i = 0;
		grades = new double[size];
		while (scan.hasNextDouble()){
			double blop = scan.nextDouble();
			grades[i] = blop;
			i++;
		}



	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;


	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i<grades.length; i++){
			sum+=grades[i];
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = grades[0];
		for (int i = 0; i<grades.length;i++){
			if (grades[i] < low){
				low = grades[i];
			}
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = grades[0];
		for (int i = 0; i<grades.length;i++){
			if (grades[i] > high){
				high = grades[i];
			}
		}


		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output= "";
		for(int i = 0; i<grades.length;i++){
			output+=grades[i] + " ";
		}
		





		return output;
	}	
}