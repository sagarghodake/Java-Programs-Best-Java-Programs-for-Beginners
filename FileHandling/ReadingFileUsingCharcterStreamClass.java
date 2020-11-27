package FileHandling;
import java.io.*;
public class ReadingFileUsingCharcterStreamClass 
{
	public static void main(String[] args) 
	{
		File f=new File("abc.txt");
		Reader re=null;
		try
		{
			re=new FileReader(f);
			int data=re.read();
			
			while(data!=-1)
			{
				System.out.println((char)data);
			}
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
		finally
		{
			try{
				re.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
