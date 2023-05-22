package BankingManagementSystem;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Bankingapplication1 {
    public static void main(String[] args) {
        int option = 0;

        int number ;
        String name;
        Double balance;
        Double amount;

        Bank bank = new Bank();
        Account account;
        Scanner scan = new Scanner(System.in);
        while(option != 6){
            System.out.println("Main Menu");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Open New Account");
            System.out.println("3. Close Exiting Account");
            System.out.println("4. Deposit");
            System.out.println("5. withdraw");
            System.out.println("6. Exit");
            System.out.println();

            System.out.print("Enter your choice:");
            option = scan.nextInt();
            scan.nextLine();


        switch(option){
            case 1:
                bank.listAccounts();
                break;
            case 2:
                System.out.print("Enter Account Name: ");
                name = scan.nextLine();

                System.out.print("Enter Initial Balance: ");
                balance = scan.nextDouble();

                number = ganerateAccountNumber();

              account = new Account(number,name,balance);
                bank.openAccount(account);
                break;
            case 3 :
                System.out.print("Enter Account Number: ");
                number = scan.nextInt();
                bank.closeAccount(number);
                break;
            case 4 :
                System.out.print("Enter Account Number: ");
                number = scan.nextInt();

                System.out.print("Enter Amount: ");
                amount = scan.nextDouble();
                bank.depositMoney(number, amount);
                break;
            case 5 :
                System.out.print("Enter Account Number: ");
                number = scan.nextInt();

                System.out.print("Enter Amount: ");
                amount = scan.nextDouble();
                bank.withdrawMoney(number, amount);
                break;
        }
            System.out.println();
        }
    }

    public static int ganerateAccountNumber(){
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000);
        return number;
    }
}
