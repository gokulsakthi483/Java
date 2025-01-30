import java.util.*;
class Animal{
void makesound(){
System.out.println("animals are makesounds");
}
}
class Cat extends Animal{
void makesound(){
System.out.println("barking..");
}
}
public class Zoo{
public static void main(String[] args)
{
Cat c1=new Cat();
c1.makesound();

}
}