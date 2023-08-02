package codes;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"Java", "is", "my","favourite","programming","language"};
		
		//string to string
		String str1=Arrays.toString(str);
		System.out.println(str1);
		
		//join method
		String str2=String.join("", str);
		System.out.println(str2);

	}

}
