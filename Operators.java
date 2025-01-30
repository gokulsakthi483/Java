import java.util.*;
public class Operators{
public static void main(String[] args){
int a=10,b=5,c=20;
boolean x=true,y=false;
System.out.println("Relational operators");
System.out.println("a==b is"+(a==b));
System.out.println("a!=c is"+(a!=c));
System.out.println("a>b is"+(a>b));
System.out.println("a<c is"+(a<c));
System.out.println("a>=c is"+(a>=c));
System.out.println("a<=b is"+(a<=b));
System.out.println("Logical operators");
System.out.println("x&&y is"+(x&&y));
System.out.println("x||y is"+(x||y));
System.out.println("!x is"+(!x));
System.out.println("Comparing relational and logical operators");
System.out.println("a>b&&b>c is"+(a>b&&b<c));
System.out.println("a<b||b<c is"+(a<b||b<c));


}
}