import java.util.*;
class perimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int rad=sc.nextInt();
        perimeter obj=new perimeter(rad);
        System.out.println("Enter length and breadth of rectangle");
        int len=sc.nextInt();
        int bread=sc.nextInt();
        obj=new perimeter(len,bread);
    }
    perimeter(int r)
    {
        System.out.println("Perimeter of circle is "+(2*3.14*r));
    }
    perimeter(int l,int b)
    {
        System.out.println("Area of rectangle is "+(2*(l+b)));
    }
}
