import java.util.*;
class concatenate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter second string");
        String str2=sc.nextLine();
        concatenate obj =new concatenate();
        obj.concat(str1,str2);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        obj.concat(num1,num2);
    }
    void concat(int a,int b)
    {
        System.out.println("Concatenated number is "+a+b);
    }
    void concat(String s,String c)
    {
        System.out.println("Concatenated string is "+s+c);
    }
}
