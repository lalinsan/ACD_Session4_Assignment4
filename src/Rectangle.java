/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 3
* Rectangle Class that extend the Shape Class and defines the methods to calculate the area and perimeter 
*/


public class Rectangle extends Shape { //Extends the Shape Class
	private final double width;  //Variable that stores the Rectangle width
	private final double length; //Variable that stores the Rectangle length
	
	public Rectangle(double width, double length) //Constructor
	{
		this.width=width; //Set width 
		this.length=length; //Set length
	}
	
	//Overrides the Shape area()
	public double area()  //Get Method that returns area based on the calculation width * length
	{
		return width * length;
	}
	
    //Overrides Shape perimeter()
	public double perimeter () //Get Method that returns perimeter based on the calculation width * length *2
	{
		return (width + length) * 2;
	}
		
}

