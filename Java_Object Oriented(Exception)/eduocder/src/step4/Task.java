package step4;

import java.util.Scanner;

public class Task
{
    /********* Begin *********/
    public static void main(String[] args) throws MyException
    {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        if (username.length() <= 3)
        {
            throw new MyException("用户名小于三位Exception");
        } else
        {
            System.out.println("用户名格式正确");
        }

    }
}

class MyException extends Exception
{
    //private static final long servialVersionUID = 1L;

    public MyException()
    {
        System.out.println("用户名小于三位");
    }

    public MyException(String msg)
    {
        super(msg);
    }
}

/********* End *********/