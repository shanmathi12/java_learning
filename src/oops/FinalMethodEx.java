package oops;

class VehicleColor
{
	void displayVehicleColor()
	{
		System.out.println("The Vehicle color is black");
		
	}
}

public class FinalMethodEx extends VehicleColor{
	
	void displayVehicleColor()
	{
		System.out.println("The Vehicle color is white");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalMethodEx obj = new FinalMethodEx();
		obj.displayVehicleColor();
	}

}
