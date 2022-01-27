import java.util.*;
class employee
{
    int emp_no,emp_phone;
    String emp_name;
    public static void main(String args[])
    {
        int i;
        employee obj[]=new employee[10];
        for(i=0;i<5;i++)
        {
            obj[i]=new employee();
            obj[i].read();
        }
        for(i=0;i<5;i++)
        {
            obj[i].display();
        }
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee");
        emp_name=sc.nextLine();
        System.out.println("Enter employee number of employee");
        emp_no=sc.nextInt();
        System.out.println("Enter phone number of employee");
        emp_phone=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name of employee is "+emp_name);
        System.out.println("Employee number of employee is "+emp_no);
        System.out.println("Phone number of employee is "+emp_phone);
    }
        
}
