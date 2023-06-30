package basics;

public class FactorialUsingReturnType {
	
	public void factorial(int factorialNumber)
	{
		int factorialResult=1;
		for(int i=1; i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		System.out.println("Factorial of a number: "+factorialNumber+" is "+factorialResult);
	}
	
	public static void main(String args[])
	{
		FactorialUsingReturnType obj1= new FactorialUsingReturnType();
		obj1.factorial(5);
		
		FactorialUsingReturnType obj2= new FactorialUsingReturnType();
		obj2.factorial(52);

		
		
	}

}
