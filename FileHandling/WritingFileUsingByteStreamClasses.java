package FileHandling;
import java.io.*;
public class WritingFileUsingByteStreamClasses 
{
	public static void main(String[] args) 
	{
		File f=new File("new.txt");
		OutputStream os=null;
		
		try
		{
			os=new FileOutputStream(f,true);
			os.write('S');
			os.write('A');
			os.write('G');
			os.write('A');
			os.write('R');
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
