package com.joramkabach;

public class Account {
        public String accountNumber = "1010101010";
        private double balance = 200;

        public void setBalance (double balance){
            this.balance = balance;
        }
        public double getBalance(){
            return this.balance;
        }
        public void showDetails(){
            System.out.println("Account Number "+ this.accountNumber) ;
            System.out.println("Balance is " + this.balance);
        }


    }

