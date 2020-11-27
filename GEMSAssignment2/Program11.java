//Depositing money in particular account
package GEMSAssignment2;

import java.util.Scanner;

public class Program11
{
	public static void main(String[] args) 
	{
		
		UserAccount2 ref[]=new UserAccount2[10];
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
			System.out.println("6.Depositing money to account");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Name:");
				System.out.println("Enter AccountType:");
				System.out.println("Enter amount to deposite in account:");
				if(noOfAccounts<ref.length)
				{
					UserAccount2 user=new UserAccount2(sc.next(),sc.next(),sc.nextInt());
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
			
			case 6:
				System.out.println("Enter account holder name:");
				String search=sc.next();
				for(int i=0;i<noOfAccounts;i++)
				{
					String currentName=ref[i].getName();
					if(currentName.equalsIgnoreCase(search))
					{
						System.out.println("Enter amount to deposite in account:");
						int enteredAmt=sc.nextInt();
						ref[i].setDepositedAmt(enteredAmt);
						System.out.println("Amount deposited sucessfully to account.");
						//System.out.println("after adding deposited amount:\n"+ref[i].toString());
					}
					else
					System.out.println("No such account found.");
				}
				break;
			default:
				System.err.println("Invalid choice entered... ");
				
			}
		}
		while(choice>=1 && choice<=6);
	}
}

	class UserAccount2
	{
		String name;
		String accoutType;
		int totalBalence;
		public UserAccount2( String name,String type,int amt)
		{
			this.name=name;
			accoutType=type;
			totalBalence=amt;
		}
		public String toString()
		{
			return ("Account Holder Name: "+name+"\nAccount Type: "+accoutType+"\nAccoutBalence:"+totalBalence);
		}
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		
		public int getDepositedAmount()
		{
			return totalBalence;
		}
		public void setDepositedAmt(int amount)
		{
			totalBalence=(totalBalence+amount);
		}
		
	}

	


