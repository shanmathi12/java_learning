package oops;

class Car2
{
	Car2()
	{
		System.out.println("Parent class constructor");
	}
}

class Hyundai extends Car2
{
	Hyundai()
	{
	System.out.println("Child class constructor");
	}
}
public class SuperConstructorEx {

	public static void main(String[] args) {
		
		Hyundai cons=new Hyundai();
		
	}
}
