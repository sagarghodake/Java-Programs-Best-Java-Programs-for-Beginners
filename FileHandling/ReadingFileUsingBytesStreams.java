package FileHandling;
import java.io.*;
public class ReadingFileUsingBytesStreams 
{
	public static void main(String[] args) 
	{
		File f=new File("abc.txt");
		InputStream input=null;
		try
		{
			input=new FileInputStream(f);
			int data=input.read();
		
			while(data!=-1)
			{
			System.out.println((char)data);
			data=input.read();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				input.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
