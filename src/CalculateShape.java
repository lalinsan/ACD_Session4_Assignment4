/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 4
* Java Programs that implements the Circle, Rectangle, Triangle Classes
* Calculates Rectangle, Circle and Triangle perimeter and area based on the values passed by the user
* Uses polymorphism to override the methods to calculate the area and perimeter 
*/

import java.util.Scanner; //Imports Scanner Class from java API Class Library
import java.text.*; //Imports Text Class from java API Class Library

public class CalculateShape {

	public static void main(String[] args) { //Main Method to call to start the Program
	    double width;  //Variable to store the Shape width - used by Rectangle
	    double length; //Variable to store the Shape length - used by Rectangle
	    double side1=0;  //Variable to store the Shape side 1 - used by Triangle
	    double side2=0;  //Variable to store the Shape side 2 - used by Triangle
	    double side3=0;  //Variable to store the Shape side 3 - used by Triangle
	    double radius; //Variable to store the Shape radius - used by Circle
	    
		
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); //Creates an Instance if of Scanner Object to take user's input
		
	    String choice="Y"; //Variable to store the user's choice to run the program. Initialized to Y
	    
	    //Prints out the App Header
	    System.out.println ("===========================================================");
	    System.out.println ("+++Shape Rectangle & Triangle & Circle Perimeter | Area Calculation+++");
	    System.out.println ("===========================================================");
	    
	    //Executes code as long as the User's choice = Y or Yes
	    while (choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"))
	    {
	        //Prints out the Rectangle Header	
	    	System.out.println ("===========================");
			System.out.println ("       ** Rectangle **     ");
			System.out.println ("===========================");
	    				
	    	System.out.print("Enter width : "); //Prompts user to enter the width
			width = sc.nextDouble(); //Stores the value entered by the user
			
			System.out.print("Enter length : "); //Prompts user to enter the width
			length = sc.nextDouble(); //Stores the value entered by the user
			Shape rectangle = new Rectangle (width, length); //Creates a new Rectangle from the Shape Class
			double rectangleArea; //Stores the result of the Rectangle Area
			rectangleArea=rectangle.area(); //Calls rectangle.area method from the Rectangle Class to calculate Rectangle Area
			double rectanglePerimeter; //Stores the result of the Perimeter Area
			rectanglePerimeter=rectangle.perimeter(); //Calls rectangle.perimeter method from the Rectangle Class to calculate Rectangle Perimeter
			
			//Prints out Rectangle Information
			System.out.println ("Rectangle width  :"+"" + width);
			System.out.println ("Rectangle length :"+"" + length);
			System.out.println ("===========================");
			System.out.println ("Rectangle Area :"+"" + rectangleArea);
			System.out.println ("Rectangle Perimiter :"+"" + rectanglePerimeter);
			System.out.println ("****************************");
			
			//Prints out the Triangle Header	
	    	System.out.println ("===========================");
			System.out.println ("       ** Triangle **     ");
			System.out.println ("===========================");
			
			System.out.print("Enter side 1 : "); //Prompts user to enter the width
			side1 = sc.nextDouble(); //Stores the value entered by the user
			
			System.out.print("Enter side 2 : "); //Prompts user to enter the width
			side2 = sc.nextDouble(); //Stores the value entered by the user
			
			System.out.print("Enter side 3 : "); //Prompts user to enter the width
			side3 = sc.nextDouble(); //Stores the value entered by the user
			
			Shape triangle = new Triangle (side1, side2, side3); //Creates a new Triangle from the Shape Class
			double triangleArea; //Stores the result of the Triangle Area
			triangleArea=triangle.area(); //Calls rectangle.area method from the Triangle Class to calculate Triangle Area
			double trianglePerimeter; //Stores the result of the Perimeter Area
			trianglePerimeter=triangle.perimeter(); //Calls triangle.perimeter method from the Triangle Class to calculate Triangle Perimeter
			
			//Prints out Triangle Information
			System.out.println ("Triangle side 1  :"+"" + side1);
			System.out.println ("Triangle side 2 :"+"" + side2);
			System.out.println ("Triangle side 3 :"+"" + side3);
			System.out.println ("===========================");
			System.out.println ("Triangle Area :"+"" + triangleArea);
			System.out.println ("Triangle Perimiter :"+"" + trianglePerimeter);
			System.out.println ("****************************");
			
			
			//Prints out the Circle Header	
			System.out.println ("===========================");
			System.out.println ("       **   Circle  **     ");
			System.out.println ("===========================");
			
			
			System.out.print("Enter radius : "); //Prompts user to enter the radius
			radius = sc.nextDouble(); //Stores the value entered by the user
			Shape circle = new Circle (radius); //Creates a new Circle from the Shape Class
			double circleArea; //Stores the result of the Circle Area
			circleArea =circle.area(); //Calls circle.area method from the Circle Class to calculate Circle Area
			double circlePerimeter; //Stores the result of the Circle Perimeter
			circlePerimeter=circle.perimeter(); //Calls circle.perimeter method from the Circle Class to calculate Circle Area
			
			DecimalFormat df = new DecimalFormat("0.000"); //Uses the DecimalFormat class and stores the defined format 3 decimal into the df variable
			
			//Prints out Circle Information
			System.out.println ("Circle Radius :"+"" + radius);
			System.out.println ("===========================");
			System.out.println ("Circle Area :"+"" + df.format(circleArea)); //uses decimal Formatting to limit the result to 3 decimals
			System.out.println ("Circle Perimiter :"+"" + df.format(circlePerimeter)); //uses decimal Formatting to limit the result to 3 decimals
			System.out.println ("****************************");
			
			System.out.print("Do you want to try again Y|N? : "); //Prompts the user to try again
			choice=sc.next(); //Stores the User's response

	    }
	    	System.out.println ("===========================");
	        System.out.print("Thanks for trying the shape App"); //Good by message
	    		
	}

}
