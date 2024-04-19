package step2;

import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account(int i, double b)
    {
        id = i;
        balance = b;
        dateCreated = new Date();
    }

    public int getId()//·ÃÎÊÆ÷
    {
        return id;
    }

    public void setID(int i)//ĞŞ¸ÄÆ÷
    {
        id = i;
    }

    public double getBalance()//·ÃÎÊÆ÷
    {
        return balance;
    }

    public void setBalance(double b)//ĞŞ¸ÄÆ÷
    {
        balance = b;
    }

    public double getAnnualInterestRate()//·ÃÎÊÆ÷
    {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double air)//ĞŞ¸ÄÆ÷
    {
        annualInterestRate = air;
    }

    Date getDateCreated()//·ÃÎÊÆ÷
    {
        return dateCreated;
    }

    public void withdraw(int i)
    {
        setBalance(balance - i);
    }

    public void deposit(int i)
    {
        setBalance(balance + i);
    }

    public double getMonthlyInterest()
    {
        return balance * annualInterestRate * 0.01;
    }

}
