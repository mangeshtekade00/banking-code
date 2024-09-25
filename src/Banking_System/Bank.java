package Banking_System;

public interface Bank {

    // just containing the definations of the methods
    public String addMoney(int money);
    public  String checkBalance(String password);
    public String withdrowMoney(String password, int money);
    public  double getRateOfInterest(int year);



}
