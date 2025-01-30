import java.util.*;
public class ReturnTwoValues{
int addition(int a,int b){
int total_value=a+b;
return total_value;
}
public static void main(String[] args){
ReturnTwoValues add=new ReturnTwoValues();
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int num1=scan.nextInt();
int result=add.addition(num,num1);
System.out.println("add the two numbers result ="+result);
}
}
