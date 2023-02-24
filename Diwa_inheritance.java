import java.util.*;
public class Diwa_inheritance extends Circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        Main m1=new Main();
         if(c=='s')
         {
          System.out.println("enter square side");
        float a=sc.nextFloat();
        m1.area(a);
        m1.perimeter(a);
         }
        if(c=='r')
        {
          System.out.println("enter rec len & bre:");
         float m=sc.nextFloat();
        float n=sc.nextFloat();
        m1.area(m,n);
        m1.perimeter(m,n);
        }
        if(c=='c')
        {
          System.out.println("enter radius:");
                double x=sc.nextDouble();
       m1.area(x);
        m1.perimeter(x);
        }
 
    }
}
class Square
{   
public void area(float a)
{
    float b=4*a;
    System.out.printf("Area: %.2f",b);
    System.out.print("\n");
}
public void perimeter(float a)
{
    float c=a*a;
    System.out.printf("perimeter: %.2f",c);
     System.out.print("\n");
}
}
class Rectangle extends Square
{   
public void area(float m,float n)
{
    float c=m*n;
    System.out.printf("Area: %.2f",c);
 System.out.print("\n");
}
public void perimeter(float m,float n)
{
    float c=2*(m+n);
    System.out.printf("perimeter: %.2f",c);
     System.out.print("\n");
}
}
class Circle extends Rectangle
{   
public void area(double x)
{
    double b=3.14*x*x;
    System.out.printf("Area: %.2f",b);
 System.out.print("\n");
}
public void perimeter(double x)
{
    double c=2*3.14*x;
    System.out.printf("perimeter: %.2f",c);
     System.out.print("\n");
}
}
