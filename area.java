import java.util.Scanner;



public class area {
    public static void main(String[] args)
    {
       
        Scanner s=new Scanner(System.in);
        System.out.println("\t\t-------AREA OF THE RECTANGLE--------");
        System.out.println("Enter the length and breadth of the reactangle:\n");
        int l=s.nextInt();
        int b=s.nextInt();
        area obj=new area(l,b);



    }
    
    area(int l,int b)
    {
        System.out.println("Area of the rectangle is :" + returnArea(l,b));
    }
    int returnArea(int a,int c)
    {
        return (a*c);

    }

}
