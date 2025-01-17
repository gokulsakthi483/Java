import java.util.*;
class ScannerInputOut
{
public static void main (String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter your name:");
String name=obj.nextLine();//read user input
System.out.println("The name is"+" "+name);

System.out.println("Enter your Age:");
int age=obj.nextInt();//read user input as int
System.out.println("The Age is"+" "+age);


System.out.println("Enter your Salary:");
int salary=obj.nextInt();//read user input as int
System.out.println("The Salary is"+" "+salary);
}
}