import java.util.*;
class palindrome
{
	public static void main(String[] args)	
	{
		int orginal,reverse=0,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		orginal=n; 
		while(n!=0)		
		{
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		if(orginal==reverse)
		{
			System.out.println(orginal+" is a palindrome");
		}
		else
		{
			System.out.println(orginal+" is not a palindrome");
		}
	}
}