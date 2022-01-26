import java.util.*;
class shape
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int rad=sc.nextInt();
        shape obj=new shape();
        obj.area(rad);
        System.out.println("Enter length and breadth of rectangle");
        int len=sc.nextInt();
        int bread=sc.nextInt();
        obj.area(len,bread);
        System.out.println("Enter base and height of triangle");
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        obj.area(base,height);
    }
    void area(int r)
    {
        System.out.println("Area of circle is "+(3.14*r*r));
    }
    void area(int l,int b)
    {
        System.out.println("Area of rectangle is "+(l*b));
    }
    void area(float b,float h)
    {
        System.out.println("Area of triangle is "+(0.5*b*h));
    }
}
