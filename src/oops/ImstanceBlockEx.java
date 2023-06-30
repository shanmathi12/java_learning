package oops;

class VehicleDetails10
{
	int vehicleSpeed;
	
	VehicleDetails10()
	{
		System.out.println("Inside constructor");
		System.out.println("Vehicle speed"+vehicleSpeed);
	}
	
	// instance block should be created inside the class but outside of any method
	{
		vehicleSpeed=120;

		System.out.println("inside instance block");
	}

	

	static
	{
		System.out.println("inside static block");
	}


public class ImstanceBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails10 obj=new VehicleDetails10();
		VehicleDetails10 obj=new VehicleDetails10();

		
		

	}

}
