package step4;

import java.util.Scanner;

public class Task
{
    /********* Begin *********/
    public static void main(String[] args) throws MyException
    {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //�ж��û���
        if (username.length() <= 3)
        {
            throw new MyException("�û���С����λException");
        } else
        {
            System.out.println("�û�����ʽ��ȷ");
        }

    }
}

class MyException extends Exception
{
    //private static final long servialVersionUID = 1L;

    public MyException()
    {
        System.out.println("�û���С����λ");
    }

    public MyException(String msg)
    {
        super(msg);
    }
}

/********* End *********/