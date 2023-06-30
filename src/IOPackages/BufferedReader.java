package IOPackages;

public class BufferedReader {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// Creating object of FileReader and BufferedReader
        // class
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);
  
        char c[] = new char[20];
  
        // Illustrating markSupported() method
        if (br.markSupported()) {
  
            // Print statement
            System.out.println(
                "mark() method is supported");
  
            // Illustrating mark method
            br.mark(100);
        }
  
        // File Contents is as follows:
        // This is first line
        // this is second line
  
        // Skipping 8 characters
        br.skip(8);
  
        // Illustrating ready() method
        if (br.ready()) {
  
            // Illustrating readLine() method
            System.out.println(br.readLine());
  
            // Illustrating read(char c[],int off,int len)
            br.read(c);
  
            for (int i = 0; i < 20; i++) {
                System.out.print(c[i]);
            }
  
            System.out.println();
  
            // Illustrating reset() method
            br.reset();
            for (int i = 0; i < 8; i++) {
  
                // Illustrating read() method
                System.out.print((char)br.read());
            }
       
    
        }


	}

}
