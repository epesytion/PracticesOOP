package Practice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount();
        System.out.println(BA.getBalance());
        BA.addMoney(100);

        System.out.println(BA.getBalance());
        BA.addMoney(5, 45);
        System.out.println(BA.getBalance());
        System.out.println(BA);//Actually, if we have no overriden method in BankAccount class, and write this syntax
        //on 13th line, we will get on output sth like Practice2.BankAccount@a09ee92
        //But because we've overrided the toString method (which is from Object class) it will output our stuff


        System.out.println("\nARRAY: \n");
        //If you wanna create array of several bankaccounts, use ArrayList
        ArrayList<BankAccount> accounts = new ArrayList<>();

        //let's add our first account from the above's lines (BA)
        accounts.add(BA);

        //let's create second bank account and add it to array at one time
        accounts.add(new BankAccount(123));
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
