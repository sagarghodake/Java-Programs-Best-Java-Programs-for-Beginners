// Implement the object array of User accounts.
//Perform following actions by taking user input
//- Adding new account
//- Updating existing account
//- Deleting existing account
//- Searching particular account
// Displaying all accounts

package GEMSAssignment2;

import java.util.Scanner;

public class Program10 
{
	public static void main(String[] args) 
	{
		UserAccount ref[]=new UserAccount[10];
		Scanner sc=new Scanner(System.in);
		int choice=0,noOfAccounts=0;
		
		do
		{
			System.out.println("\nMenu...");
			System.out.println("1.Adding new account");
			System.out.println("2.Updating existing account");
			System.out.println("3.Deleting existing account");
			System.out.println("4.Searching particular account");
			System.out.println("5.Displaying all accounts");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(noOfAccounts<ref.length)
				{
					UserAccount user=new UserAccount(sc.next(),sc.next());
					ref[noOfAccounts]=user;
					noOfAccounts++;
				}
				else
				{
					System.out.println("Not Enough Space");
				}
				break;
			case 2:
				System.out.println("Enter account holder name:");
				String editName=sc.next();
				System.out.println("Enter name to replace:");
				String replaceName=sc.next();
				for(int i=0;i<noOfAccounts;i++)
				{
					String currentName=ref[i].getName();
					if(editName.equals(currentName))
					{
						ref[i].setName(replaceName);
						break;
					}
				}
				break;
			case 3:
				System.out.println("Enter AccountHolder name to delete account");
				String deleteAccount=sc.next();
				for(int i=0;i<noOfAccounts;i++)
				{
					String currentName=ref[i].getName();
					if(currentName.equals(deleteAccount))
					{
						ref[i]=null;
					}
					System.out.println("Account delete sucessfully...");
					break;
				}
				break;
			case 4:
				System.out.println("Enter Account Holder Name:");
				String nameToBeSearch=sc.next();
				for(int i=0;i<noOfAccounts;i++)
				{
					String currentName=ref[i].getName();
					if(currentName.equalsIgnoreCase(nameToBeSearch))
					System.out.println("Account Details with Name:\n"+ref[i]);
					else
						System.out.println("No such account found.");
					break;
				}
				break;
				
			case 5:
				for(int i=0;i<noOfAccounts;i++)
				{
					System.out.println(ref[i].toString());
				}
				break;
			default:
				System.out.println("Invalid choice entered... ");
				
			}
		}
		while(choice>=1 && choice<=5);
		
	}

}

class UserAccount
{
	String name;
	String accoutType;
	public UserAccount( String name,String type)
	{
		this.name=name;
		accoutType=type;
	}
	public String toString()
	{
		return ("Account Holder Name: "+name+"\nAccount Type: "+accoutType);
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
}
