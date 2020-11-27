package FileHandling;
import java.io.*;
public class WritingFileUsingCharcterStreamClasses 
{
	public static void main(String[] args) 
	{
		File fileToWrite=new File("abc.txt");
		Writer w=null;
		try
		{
			w=new FileWriter(fileToWrite);
			w.write(65);
			w.write('A');
			w.write("The function to write a string to file using FileWriter");
			
			char data[]="Data in string".toCharArray();
			w.write(data);
			w.write("ASDFGHJKL",10,16);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				w.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
