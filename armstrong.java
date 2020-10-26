import java.util.*;
class armstrong
{
	public static void main(String[] args)	
	{
		int temp,total=0,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		temp=n; 
		while(temp!=0)
		{
			r=temp%10;
			total+=r*r*r;
			temp=temp/10;
		}
		if(total==n)
		{
			System.out.println(n+" is  an armstrong");
		}
		else	
		{
			System.out.println(n+" is not an armstrong");
		}
	}
}