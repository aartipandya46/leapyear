import java.util.*;
public class LeapYear
{
	boolean CheckLeapYear(int year)
	{
		boolean flag=false;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					flag=true;
				else
					flag=false;
			}
			else
				flag=true;
		}
		else 
			flag=false;
		return flag;
	}
	public static void main(String args[])
	{
		
		LeapYear c=new LeapYear();
		Scanner sc= new Scanner(System.in); 
		
		System.out.print("Enter Year - ");  
		int year= sc.nextInt();  
		if(c.CheckLeapYear(year))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");	
		sc.close();
	}
}
