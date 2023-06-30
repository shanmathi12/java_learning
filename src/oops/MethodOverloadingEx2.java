package oops;

class Addition
{
	int a,b;
	void add(int a, int b)
	{
		int result = a+b;
		System.out.println("The addition of 2 nos is "+result);
		
	}
	
	void add(double c, double d)
	{
		double result= c+d;
		System.out.println("The addition of 2 nos is "+result);	
	}
}
public class MethodOverloadingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		obj.add(12.5,13.5);
		obj.add(12,12);

	}

}
