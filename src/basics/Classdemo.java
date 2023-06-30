package basics;

public class Classdemo {
	
	int num=10;
	
	public void addTwoNumbers(int a, int b)
	{
		int result= a+b;
		System.out.println("Addition of two numbers is "+result);
	}
	
	public static void main(String args[])
	{
		//classname object = new classname()	;
		Classdemo obj1= new Classdemo();
		System.out.println(obj1.num);
		obj1.addTwoNumbers(10, 20);
		
		Classdemo obj2 = new Classdemo();
		System.out.println(obj2.num);
		obj2.addTwoNumbers(32, 20);

		
		
		}

}
