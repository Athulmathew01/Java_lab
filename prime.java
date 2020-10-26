import java.util.*;
class prime
{
	public static void main(String[] args)	
	{
		int i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int a=s.nextInt();
		for(i=2;i<a/2;++i)
		{
			if(a%i==0)
			{
				flag=true;
				break;	
			}
		}
		if(!flag)
		{
			System.out.println(a+" is a prime number");
		}
		else
		{
			System.out.println(a+" is a not a prime number");
		}


	}
}