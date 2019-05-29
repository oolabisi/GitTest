import java.util.Scanner;

public class Account{
    // instance variable
    private String name;
    private double balance;

    // constructor for both instance variables
    public Account(String name, double balance){
        this.name = name;

        if(balance>0.0){
        this.balance = balance;
        }
    }
        // set and get -Method for the instances        
        public void withdraw(double withdrawAmount){
            if(withdrawAmount>0.0){
                balance = balance-withdrawAmount;
            }
            if(withdrawAmount>balance){
                 System.out.println("Withdrawal amount exceedes account balance");
            }
        }
        public double getBalance() {
                 return balance;         
        }
                public void setName(String name){
                    this.name = name;
                }
                public String getName(){
                    return name;
                } 
}    // for class

class AccountTest{
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 500.00);
        Account account2 = new Account("John Blue", 700.53);
       
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
       
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nsubtract %.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);
       
        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
       
        System.out.print("Enter withdrawal amount for account2: "); 
        withdrawAmount = input.nextDouble(); 
        System.out.printf("%nsubtract %.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
        }
}