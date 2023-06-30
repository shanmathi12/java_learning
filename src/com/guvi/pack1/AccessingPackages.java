package com.guvi.pack1;

import com.guvi.pack.AA;

import com.guvi.pack.*;

public class AccessingPackages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA obj = new AA();
		obj.msg();
		
		BB obj1 = new BB();
		obj1.msg2();
		
		//using a fully qualified name instead of importing the package
				com.guvi.pack.AA obj3 = new com.guvi.pack.AA();
				obj3.msg();
				
				//Accessing the subpackage
				SubpackageEx obj4 = new SubpackageEx();
				obj4.message3();
				
				


	}

}
