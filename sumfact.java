import java.util.*;
class sumfact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sumfact fact=new sumfact();
        fact.factorial(n);
        fact.sum(n);
    }
    void factorial(int x)
    {
        int i,fact=1;
        for(i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number is "+fact);
    }
    void sum(int x)
    {
        int rem,sum=0;
        while(x!=0)
        {
            rem=x%10;
            sum=sum+rem;
            x=x/10;
        }
        System.out.println("Sum of digits of the number is "+sum);
    }
}
