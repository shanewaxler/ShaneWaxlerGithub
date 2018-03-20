//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	public Monster(){
		myWeight = 0;
		myHeight = 0;
		myAge = 0; 
	}



	public Monster(int ht){
		setHeight(ht);
	}



	public Monster(int ht, int wt){
		setHeight(ht);
		setWeight(wt);
	}

	public Monster(int ht, int wt, int age){
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}



	public void setWeight(int wt){
		myWeight = wt;
	}
	public void setHeight(int ht){
		myHeight = ht;
	}
	public void setAge(int age){
		myAge = age;
	}
	
	public int getWeight(){
		return myWeight;
	}
	public int getHeight(){
		return myHeight;
	}
	public int getAge(){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight,myWeight,myAge);
	}

	public boolean equals( Monster obj )
	{
		if (myHeight == obj.getHeight()){
			if (myWeight == obj.getWeight()){
				if (myAge == obj.getAge()){
					return true;
				}
			}
		}
		return false;
	}

	public int compareTo( Monster obj )
	{
		Monster rhs = (Monster)obj;
		if (myHeight==obj.getHeight()){
			if (myWeight==obj.getWeight()){
				if (myAge==obj.getAge()){
					return 0;
				}
				else if (myAge>obj.getAge()){
					return 1;
				}
				else{
					return -1;
				}
			}
			else if (myWeight>obj.getWeight()){
				return 1;
			}
			else{
				return -1;
			}
		}
		else if (myHeight>obj.getHeight()){
			return 1;
		}
		else{
			return -1;
		}
	}
	
	public String toString(){
		return "" + myHeight + " " +myWeight + " " + myAge; 
	}
	
	
}