package Banking_System;

public class NoBank implements Bank{
    public  int accountNo;

 public  String AccountName;
 private  String secrateCode;
 private  double balance ;
 public  double minBalance;
 public  static final  double rateOfInterest = 5.5;

    public NoBank(String accountName, String secrateCode, double balance) {
        AccountName = accountName;
        this.secrateCode = secrateCode;
        this.balance = balance;
        minBalance = 5000.0;
    }

    public String addMoney(int money) {
      balance = balance+money;
      return  " the money is"+balance;
    }

    public String checkBalance(String password) {
        if(password.equals(this.secrateCode)){
        return "The available balance is "+balance;
    }else {
            return "The password is incorrect";
        }
    }

    public String withdrowMoney(String password, int money) {
       if(password.equals(this.secrateCode)){
           if(balance >= (money+minBalance)){
               balance = balance - money;
               return "The "+money+"has been withrodrn from account, The final balance is "+balance;
           }else {
               return " sufficient balance is jnot avaible";
           }
       }
       else {
           return "Secrate code is invalid";
       }
    }

    public double getRateOfInterest(int year) {
       double interest = (balance*NoBank.rateOfInterest*year)/100;
       return interest;
    }
}
