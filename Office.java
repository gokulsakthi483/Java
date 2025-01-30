import java.util.*;
class Employee{
void work(){
System.out.println("employees are working..");
}
void getSalary(){
System.out.println("salary range between 20000 to 40000 per employee");
}
}
class HRManager extends Employee{
void work(){
System.out.println("employees are working in office");
}
void addEmployee(){
System.out.println("added a new employee at office");
}
}
public class Office{
public static void main(String[] args){
HRManager HR=new HRManager();
HR.work();
HR.getSalary();
HR.addEmployee();

}
}