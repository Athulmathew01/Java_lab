import java.util.*;
class oddeven
{
	public static void main(String[] args)		
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int a =s.nextInt();
		if(a%2==0)
		{ 
			System.out.println(a+" is an even number");
		}
		else
		{
			System.out.println(a+" is an odd number");
		}
	}
}