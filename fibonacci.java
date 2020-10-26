import java.util.*;
class fibonacci
{
	public static void main(String[] args)	
	{
		int i,a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=s.nextInt();
		System.out.println("Fibonacci Series :");
		for(i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
		