
public class Triangle extends Shape
{

	public final double side1;
	public final double side2;
	public final double side3;
	
	
	public Triangle (double side1, double side2, double side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	    //Overrides the Shape area()
		public double area () //Get Method that returns area based on the calculation SquareRoot(sr * (sr - a) * (sr - b) * (sr - c))
		{
			double sr;
			sr = (side1 + side2 + side3 )/ 2 ;
	        double area = Math.sqrt(sr * (sr - side1) * (sr - side2) * (sr - side3));
	        return area;
			
		}
		
		//Overrides Shape perimeter()
		public double perimeter () //Get Method that returns perimeter based on the calculation of (side1 + side2 +side3)
		{
			return (side1 + side2 +side3);
		}
}
