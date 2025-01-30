import java.util.*;
class Shapes{
void getArea(){
int num=3;
int area=num^2;
System.out.println("get area of square:"+area);
}
}
class Rectangle extends Shapes{
void getArea(){
int l=3;
int b=4;
int Area=l*b;
System.out.println("rectangle area is:"+Area);
}
}
public class Math
{
public static void main(String[] args){
Rectangle r1=new Rectangle();

r1.getArea();


}
}