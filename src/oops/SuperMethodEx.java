package oops;

class Car1
{
	String carColor="black";
	
	void displayColor()
	{

	}
}

class Maruthi extends Car1
{
	String carColor="red";
	
	void displayColor()
	{
		System.out.println("the car color in super class is "+carColor);

	}
	
	void getAllCarData()
	{
		displayColor();
		super.displayColor();
		
	}
	
}
 
public class SuperMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruthi mar = new Maruthi();
		mar.getAllCarData();

	}

}
