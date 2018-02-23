//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public Fahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = (fahrenheit-32)*(5.0/9);
		return celsius;
	}

	public void print()
	{
		System.out.println(fahrenheit+" degrees Fahrenheit == " +getCelsius() + " degrees Celcius");
	}
}