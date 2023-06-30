package basics;

public class LogicalOperators {
	
	public static void main(String[] args) {
		//todo auto-generated method stub
		/*&&
		 * ||
		 * !
		 */
		int a=10, b=20, c=5;
		boolean val= true;
		
		System.out.println("Not Operator-->"+!val);
		if((a > b) && (b>c))
		{
			System.out.println("if block");
		}
		else if ((a>b) || (b > c))
		{
			System.out.println("Inside Else if");
		}
		else
		{
			System.out.println("Else block");
		}
	}
	
	

}
