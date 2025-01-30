import java.util.*;
class Vehicle{
void drive(){
System.out.println("vehicles are moving on the road");

}
}
class Car extends Vehicle{
void drive(){
System.out.println("Repairing a car...");
}
}
public class Transport{
public static void main(String[] args){
Car c1=new Car();
c1.drive();

}
}