package septest;

import java.util.Scanner;
public class AccountPin {
	public static final int accpin=1234;
	public static void main(String args[]) {
		
	Scanner sc=new Scanner(System.in);
	
	int count=0;
	while(true)
	{
		
		System.out.println("Enter the PIN: " );
		int input=sc.nextInt();
		
		if(accpin==input) 
		{ //if pin entered is correct
			System.out.println("Correct, welcome back.");
		
			break;
		}
		
		else
		{//if pin entered is incorrect
			if(count<2) 
			{
			System.out.println("Incorrect, try again.");
			}
		
		
		}
		count++;
		
		if(count>=3)
		{		//after 3 unsuccessful trials
		System.out.println("Sorry but you have been locked out.");
		break;	
		}
		
	}
		
	sc.close();
		
	}
}