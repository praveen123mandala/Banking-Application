import java.util.Scanner;
public class BankingApplication
{
public static void main(String args[])
{
BankAccount obj1=new BankAccount("ABC","AB0001");
obj1.showMenu();
}
}

class BankAccount{
int balance;
int previousTransaction;
String customerName;
String customerId;
BankAccount(String cname,String cid)
{
customerName=cname;
customerId=cid;
}

void deposit(int amount)
{
if(amount!=0){
balance=balance+amount;
previousTransaction=amount;
}
}
void withdraw(int amount)
{
if(amount!=0){
balance=balance-amount;
previousTransaction=-amount;
}
}
void getPreviousTransaction()
{
if(previousTransaction>0)
{
System.out.println("deposite:"+previousTransaction);
}
else if(previousTransaction<0){
System.out.println("withdraw:"+Math.abs(previousTransaction));
}
else
{
System.out.println("no transaction occured");
}
}
void showMenu()
{
char option='\0';
Scanner scanner = new Scanner(System.in);
System.out.println("welcome"+customerName);
System.out.println("your Id"+customerId);
System.out.println("\n");
System.out.println("A:check your balance");
System.out.println("B:deposite");
System.out.println("c:withdraw");
System.out.println("d:previous transaction");
System.out.println("e:exit the system");
do {
System.out.println("===============================================================================================================================================================");
System.out.println("enter your option");
System.out.println("===============================================================================================================================================================");
option = scanner.next().charAt(0);
System.out.println("\n");
switch(option){
case 'A':
System.out.println("__________________________________________________________________________________");
System.out.println("balance="+balance);
System.out.println("__________________________________________________________________________________");
System.out.println("\n");
break;
case 'B':
System.out.println("__________________________________________________________________________________");
System.out.println("enter amount to deposit");
System.out.println("__________________________________________________________________________________");
int amount=scanner.nextInt();
deposit(amount);

System.out.println("\n");
break;

case 'C':
System.out.println("__________________________________________________________________________________");
System.out.println("enter amount to withdraw");
System.out.println("__________________________________________________________________________________");
int amount2=scanner.nextInt();
withdraw(amount2);

System.out.println("\n");
break;
case 'D':
System.out.println("__________________________________________________________________________________");
getPreviousTransaction();
System.out.println("__________________________________________________________________________________");
System.out.println("\n");
break;
case 'E' :
System.out.println("===================================================================================");
break;
default:
System.out.println("invalid please enter correct option...");

break;
}
}
while(option!= 'E');
System.out.println("thankyou for using our services");

}
}