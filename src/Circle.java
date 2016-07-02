/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 3
* Circle Class that extend the Shape Class and defines the methods to calculate the area and perimeter 
*/


public class Circle extends Shape { //Extends the Shape Class
	private final double radius; //Variable that stores the Circle radius
	final double pi = Math.PI;   //Variable that stores pi (PI is calculated using the Math Class
	
	public Circle (double radius) //Default constructor 
	{
		this.radius=radius; //Sets radius
			
	}
	
	//Overrides the Shape area()
	public double area () //Get Method that returns area based on the calculation π r^2
	{
		return pi * Math.pow(radius, 2);
	}
	
	//Overrides Shape perimeter()
	public double perimeter () //Get Method that returns perimeter based on the calculation 2πr
	{
		return (pi * radius) * 2;
	}
	

}
