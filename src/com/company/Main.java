package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(20000);

        while (true){
            System.out.println("enter the amount that you want to take");
             Double sum=scanner.nextDouble();
            try {
                bankAccount.withDraw(sum);
                System.out.println("you take " +sum+ "soms from your Bank Account and you left "+ bankAccount.getAmount()+"soms");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                   System.out.println("you want to take " + sum+  "soms from your bank account but you have only "
                                    + bankAccount.getAmount()+" soms and because of it we take " + bankAccount.getAmount()+ " soms");
                bankAccount.setAmount(bankAccount.getAmount()- bankAccount.getAmount());
                System.out.println( "you left " + bankAccount.getAmount()+" soms");
                System.out.println("thank you for choosing us "+
                        "\nBye Bye");
                    break;
                }
            }


        }


}
