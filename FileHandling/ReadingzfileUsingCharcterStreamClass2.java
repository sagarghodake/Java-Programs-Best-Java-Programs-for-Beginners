package FileHandling;
import java.io.*;
public class ReadingzfileUsingCharcterStreamClass2 
{
	public static void main(String[] args) 
	{
		File f=new File("abc.txt");
		char data[]=new char[(int)f.length()];
		Reader r=null;
		try
		{
			r=new FileReader(f);
			r.read(data);
			
			for(int i=0;i<data.length;i++)
			{
				System.out.print(data[i]+" ");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
