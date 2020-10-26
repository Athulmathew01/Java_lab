import java.util.*;
class n
{
	public static void main(String[] args)	
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int a=s.nextInt();
		for(i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("Sum is : "+sum);
	}
}