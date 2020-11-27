// Implement the object array of Books.
//Perform following actions by taking user input
//- Adding new Book
//- Updating existing Book
//- Deleting existing Book
//- Searching particular Book
//- Displaying all Books
package GEMSAssignment2;
import java.util.*;
public class Progam15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Books ref[]=new Books[5];
		int choice=0,noOfBooks=0;
		do
		{
			System.out.println("\nMenu...");
			System.out.println("1.Adding new Book");
			System.out.println("2.Updating existing Book");
			System.out.println("3.Deleting existing Book");
			System.out.println("4.Searching particular Book");
			System.out.println("5.Displaying all Books");
			System.out.println("\nEnter your choice...");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Book name:\nAuther Name:\nBook Prize:");
					if(noOfBooks<ref.length)
					{
						Books bk=new Books(sc.next(), sc.next(), sc.nextInt());
						ref[noOfBooks]=bk;
						noOfBooks++;
						System.out.println("Book details added sucessfully.");
					}
					else
						System.out.println("No Books details added.");
					break;
					
				case 2:
					System.out.println("Enter Book name to search...");
					String update=sc.next();
					System.out.println("Enter Book name to update...");
					String replace=sc.next();
					for(int i=0;i<noOfBooks;i++)
					{
						String currentBook=ref[i].getBookName();
						if(currentBook.equalsIgnoreCase(update))
						{
							ref[i].setBookName(replace);
							System.out.println("Book name updated sucessfully.");
						}
					}	
					break;
				
				case 3:
					System.out.println("Enter book name to delete details:");
					String bookName=sc.next();
					for(int i=0;i<noOfBooks;i++)
					{
						String currentBook=ref[i].getBookName();
						if(currentBook.equalsIgnoreCase(bookName))
						{
							ref[i]=null;
							for(int j=i;j<noOfBooks-1;j++)
							{
								Books temp=ref[j];
								ref[j]=ref[j+1];
								ref[j+1]=temp;
							}
							System.out.println("Books details deleted sucessfully.");
							break;
						}
					}
					noOfBooks--;
					break;
				
				case 4:
					System.out.println("Enter Book name for getting details...");
					String search=sc.next();
					for(int i=0;i<noOfBooks;i++)
					{
						String currentBook=ref[i].getBookName();
						if(currentBook.equalsIgnoreCase(search))
						{
							System.out.println(ref[i].toString());
							break;
						}
					}
					break;
					
				case 5:
					System.out.println("Details of all Books are:\n");
					for(int i=0;i<noOfBooks;i++)
					{
						System.out.println(ref[i].toString()+"\n");
					}
					break;
					
				default:
					System.out.println("Invalid entered choice");
					break;
			}
			
		}
		while(choice>=1 && choice<=5);
	}

}

class Books
{
	String bookName;
	String bookAuther;
	int bookPrize;
	Books(String name,String auther,int prize)
	{
		bookName=name;
		bookAuther=auther;
		bookPrize=prize;
	}
	
	public String toString()
	{
		return ("Book Name:"+bookName+"\nBook Auther:"+bookAuther+"\nBook Prize:"+bookPrize);
	}
	
	public String getBookName()
	{
		return bookName;
	}
	public void setBookName(String name)
	{
		bookName=name;
	}
}