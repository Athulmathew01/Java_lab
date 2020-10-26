import java.util.*;

class factor
{
	public static void main(String[] args)	
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		System.out.println("\n");
		for(i=1;i<=a;i++)
		{	
			if(a%i==0)
			{
				System.out.println(i+"	is a factor of  "+a);
			}
		}
	}
}
