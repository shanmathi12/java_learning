package oops;

class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
	
}
public class MethodOverridingEx extends Bike{
	
	void run()
	{
		System.out.println("This run method is in child class");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingEx obj=new MethodOverridingEx();
		obj.run();

	}

}

