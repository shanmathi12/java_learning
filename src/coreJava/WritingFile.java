package coreJava;

public class WritingFile {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * FileWriter class
		
		FileWriter fwrite= new FileWriter("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\corejava\\sample.txt");
		
		
		
		String writeString="We are learning file operations";
		
		fwrite.write(writeString);
		
		fwrite.close();
		
		System.out.println("File writing operation successful");
		*/
		
		///BufferedWriter
	
		
		BufferedWriter brWriter= new BufferedWriter(new FileWriter("C:\\\\Users\\\\Guest User\\\\guvilearning\\\\Javaguv\\\\src\\\\corejava\\\\sample.txt"));
		
		String str="Writing using Bufferred WRiter";
		brWriter.write(str);
		
		brWriter.close();
		
		System.out.println("File writing successful");
		

	}



}
