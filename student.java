import java.util.*;
class student
{
    int i,roll;
    int mark[]=new int[10];
    String name;
    public static void main(String args[])
    {
        student stud=new student();
        stud.read(5);
        stud.display(5);
    }
    void read(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the student:");
        name=sc.nextLine();
        System.out.print("Enter roll number of the student:");
        roll=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter mark of subject "+(i+1));
            mark[i]=sc.nextInt();
        }
    }
    void display(int n)
    {
        System.out.println("Name of student is "+name);
        System.out.println("Roll number of student is "+roll);
        for(i=0;i<n;i++)
        {
            System.out.println("Mark of subject "+(i+1)+" is:"+mark[i]);
        }
    }
}
