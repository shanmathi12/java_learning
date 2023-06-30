package oops;

//polymorphium--> many forms
//under that  we have 1. method overloading and 2. method overloading

class Arithmetic
{
	int a,b;
	void add(int a, int b)
	{
		int result = a+b;
		System.out.println("The addition of 2 nos is "+result);
		
	}
	
	void add(int a, int b, int c)
	{
		int result= a+b+c;
		System.out.println("The addition of 3 nos is "+result);

		
	}
	
}

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic  obj= new Arithmetic();
		obj.add(20,20);
		obj.add(10,20,30);

	}

}
