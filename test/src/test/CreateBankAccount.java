package test;
import java.util.Scanner;

public class CreateBankAccount {
	
	String accno;  
    String name;  
    String acc_type;  
    long balance;  
    Scanner sc = new Scanner(System.in);
    
    void OpenAccount() 
    {
    	System.out.print("Enter the account number");
    	accno = sc.next();
    	
    	System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();
	}
    
    void showAccount() 
    {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    
    void deposit() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }
    
    void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) 
        {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } 
        else 
        {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    
    boolean search(String ac_no) 
    {  
        if (accno.equals(ac_no)) 
        {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
    
}