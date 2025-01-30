import java.util.*;
class BankAccount{
double balance;
BankAccount (double balance){
this.balance=balance;
}
void deposit(double amount){
balance=balance+amount;

System.out.println("deposited amount"+amount);
System.out.println("current balance:"+balance);
}
void withdraw(double amount){
balance=balance-amount;
System.out.println("withdraw amount:"+balance);
}
}
class SavingsAccount extends BankAccount{
SavingsAccount(double  balance){
super(balance);
}
void withdraw(double amount){
if(balance-amount<100){
System.out.println("withdraw denied. minimumbalance of 100 required.");

}
else{
super.withdraw(amount);
}
}
}
public class Banksector{
public static void main(String[] args){
SavingsAccount saving=new SavingsAccount(500);
saving.withdraw(450);
saving.withdraw(50);
}
}

