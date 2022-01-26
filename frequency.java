import java.util.*;
class frequency
{
    int i;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter the character whose frequency is to be calculated");
        char ch=sc.next().charAt(0);
        frequency obj=new frequency();
        obj.freq(str,ch);
        obj.reverse(str);
    }
    void freq(String s,char c)
    {
        int count=0;
        
        for(i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of the character "+c+" in the string "+s+" is "+count);
    }
    void reverse(String s)
    {
        int n=s.length();
        String c="";
        for(i=0;i<n;n--)
        {
            c+=s.charAt(n-1);
        }
        System.out.println("Reverse of the string is "+c);
    }
}
