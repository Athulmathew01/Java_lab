import java.util.*;
class factorial
{
	public static void main(String[] args)	
	{
		int i,fac=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		for(i=1;i<=a;i++)
		{
			fac*=i;
			System.out.println("The factorial of "+i+" is "+fac);
		}
	}
}
