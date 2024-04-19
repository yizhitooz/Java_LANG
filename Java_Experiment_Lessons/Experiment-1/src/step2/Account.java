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

    public int getId()//������
    {
        return id;
    }

    public void setID(int i)//�޸���
    {
        id = i;
    }

    public double getBalance()//������
    {
        return balance;
    }

    public void setBalance(double b)//�޸���
    {
        balance = b;
    }

    public double getAnnualInterestRate()//������
    {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double air)//�޸���
    {
        annualInterestRate = air;
    }

    Date getDateCreated()//������
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
