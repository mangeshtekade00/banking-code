package Banking_System;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to NoBank !!");
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        System.out.println("Enter initial balance");
        double initialBalance = sc.nextDouble();


        Bank bankAc = new NoBank(name,password,initialBalance);
        System.out.println("Bank account has been created ny the name  "+ name);

        System.out.println("Enter the money to add");
        int addMoney = sc.nextInt();
        String result = bankAc.addMoney(addMoney);
        System.out.println(result);

        System.out.println("Enter money to withdrow");
        addMoney = sc.nextInt();
        System.out.println("Enter the password");
        password = sc.next();
         result = bankAc.withdrowMoney(password,addMoney);
        System.out.println(result);


        System.out.println("Check available Balance");
        System.out.println("Enter the password");
        password = sc.next();
        result = bankAc.checkBalance(password);


        System.out.println("Enter the years to invest money");
        int year = sc.nextInt();
        double rateOfInterest = bankAc.getRateOfInterest(year);
        System.out.println("The rate of interest is "+rateOfInterest);

}
}