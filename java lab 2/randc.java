
import java.util.Scanner;

public class randc {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle:");
        int h=s.nextInt();
        int w=s.nextInt();
        tarea obj=new tarea();
        obj.area(h,w);
        System.out.println("Enter the radius of the circle:");
        int r=s.nextInt();
        obj.area(r);
        s.close();
        
    }   
}
class tarea
{

    void area(int h, int w)
    {
        int a=w*h;
        System.out.println("Area of the Rectangle is :"+a);

    }
    void area(int r)
    {
        double pi = 3.141592653589793238;
        double b=pi*r*r;
        System.out.println("Area of the Circle is : "+b);

    }

}