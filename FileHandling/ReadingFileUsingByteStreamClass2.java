package FileHandling;
import java.io.*;
public class ReadingFileUsingByteStreamClass2 
{
	public static void main(String[] args) 
	{
		File f=new File("new.txt");
		byte data[]=new byte[(int)f.length()];
		InputStream input=null;
		try
		{
			input=new FileInputStream(f);
			input.read(data);
			for(int i=0;i<data.length;i++)
			{
				System.out.println((char)data[i]+" ");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
