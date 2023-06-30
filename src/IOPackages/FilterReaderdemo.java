package IOPackages;

public class FilterReaderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reader r = new StringReader("GeeksforGeeks");
        FilterReader fr = new FilterReader(r) 
        {
        };
        char ch[] = new char[8];
          
        //illustrating markSupported()
        if(fr.markSupported())
        {
            //illustrating mark() method
            System.out.println("mark method is supported");
            fr.mark(100);
        }
          
        //illustrating skip() method
        fr.skip(5);
          
        //illustrating ready()
        if(fr.ready())
        {
            //illustrating read(char[] cbuff,int off,int len)
            fr.read(ch);
            for (int i = 0; i < 8; i++) 
            {
                System.out.print(ch[i]);
            }
              
            //illustrating reset()
            fr.reset();
            for (int i = 0; i <5 ; i++)
            {
                //illustrating read()
                System.out.print((char)fr.read());
            }
        }
          
        //closing the stream
        fr.close();
        

	}

}
