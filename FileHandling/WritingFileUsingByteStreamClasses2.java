package FileHandling;
import java.io.*;
public class WritingFileUsingByteStreamClasses2 
{
	public static void main(String[] args) 
	{
		File f=new File("new.txt");
		OutputStream os=null;
		byte data[]="I am in Squad".getBytes();
		try
		{
			os=new FileOutputStream(f,true);
			os.write(data);
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
		
	}

}
