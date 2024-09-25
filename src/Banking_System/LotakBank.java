package Banking_System;

public class LotakBank implements Bank{
    private String  Account_number;
    private double balance ;
    private String password;
    public static final double rateOfInterest = 6.5;
public LotakBank( String password, double balance){
    // TODO : random generator function
    // generate the random account number 10digit and initilize it
    this.password = password;
    this.balance = balance;
}
    public String addMoney(int money) {
    balance = balance+money;
        return "The"+money+"amount has been added the new balance is"+balance;
    }

    public String checkBalance(String password) {
      if(password.equals(this.password)){
          return "The available balance is"+this.password;
      }
      else {
          return "The password is inccorect.";

      }
    }

    public String withdrowMoney(String password, int money) {

      if(password.equals(this.password)){
          if(balance > money){
          balance = balance -money;
          return "The money has been withdrown. The remaining balance is"+balance;
      }
          else{
              return "The availabe balance is less then the money wants to withdrown" ;
          }
      }
      else {
          return "Password is incorrect";
      }
    }

    public double getRateOfInterest(int year) {
    double interest = (balance*LotakBank.rateOfInterest*year)/100;

        return interest;
    }
}
