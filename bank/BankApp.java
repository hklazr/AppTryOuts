package assess.bank;
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
    }
      
    // Bank details
    private String accno;
    private String name;
    private String acc_type;
    private long balance;

Scanner sc = new Scanner(System.in);


    // Method to display account details

    public void showAccount() {
        System.out.println("Name of account holder:" + name) ;
        System.out.println("Account no:" + accno) ;
        System.out.println("Account type:" + acc_type) ;
        System.out.println("Balance:" + balance) ;
       
}  
}

