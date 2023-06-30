package oops;

class VehicleDetails2
{
	String vehicleName="Scooty";
	int price=60000;
	static String vehicleType;
	
	VehicleDetails2()
	{
		System.out.println("Inside the constructor");
	}
	
	void displayData()
	{
		System.out.println("Inside non static method");
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
	{
		System.out.println("Inside");
		System.out.println("Inside static block");	
	}
}

public class StaticBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleDetails2 obj = new VehicleDetails2();
		obj.displayData();

	}

}
