package oops;


public class FinalVariableEx {
	
	int rollNo=10;
	
	void displayRollNo()
	{
		rollNo=20;
		System.out.println("The roll number is "+rollNo);
		
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		FinalVariableEx obj = new FinalVariableEx();
		obj.displayRollNo();

	}

}
