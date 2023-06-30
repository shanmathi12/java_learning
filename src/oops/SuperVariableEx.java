package oops;

class Car
{
	String carColor="BLACK";
}

class Mahindra extends Car
{
	String carColor="Red";
	
	void displayColor()
	{
		System.out.println("the car color in super class is "+carColor);
		System.out.println("the car color in super class is "+super.carColor);

	}
}

public class SuperVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahindra mahindra = new Mahindra();
		mahindra.displayColor();

	}

}
