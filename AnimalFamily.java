import java.util.*;
class Animal{
void move(){
System.out.println("animals are walking ");
}
}
class Cheetah extends Animal{
void move(){
System.out.println("Cheetah run fastly");
}
}
public class AnimalFamily{
public static void main(String[] args){
Cheetah c1=new Cheetah();
c1.move();
}
}