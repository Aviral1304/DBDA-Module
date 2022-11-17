import java.util.Scanner;
class LowBalance extends Exception{
    LowBalance(String msg){
        System.out.println(msg);
        System.out.println("Please enter valid amount less than or equals to your Balance amount ");
    }

}
public class BankAccount {
    int accno;
    double balance;

    public BankAccount(int accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }
    void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Successfully withdraw  : "+amount);
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Succesfully deposited : "+amount);
    }
    void show(){
        System.out.println("Account Number : "+accno+" \nCurrent Balance :"+balance);
    }

    public static void main(String[] args) throws LowBalance,Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial amount for your bank account : ");
        double amt=sc.nextDouble();
        BankAccount obj1=new BankAccount(1000,amt);
       a: while(true){
           System.out.println("\nSelect the operation \n1.To Withdraw \n2.To Deposit \n3.To Show \n4.To exit");
           int choice=sc.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("Enter the amount to withdraw");
                   double amount = sc.nextInt();
                   if (obj1.balance < amount) {
                       throw new LowBalance("Insufficient amount");
                   } else {
                       obj1.withdraw(amount);
                   }
                   break;
               case 2:
                   System.out.println("Enter the amount to deposit");
                   double amount2 = sc.nextInt();
                   obj1.deposit(amount2);
                   break;
               case 3:
                   obj1.show();
                   break;
               case 4:
                   break a;
           }
       }
    }
}
