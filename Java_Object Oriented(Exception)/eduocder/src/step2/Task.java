package step2;

import java.util.Scanner;

public class Task
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        /********* Begin *********/
        try
        {
            System.out.println(num1 / num2);
        } catch (Exception e)
        {
            System.out.println("��������Ϊ0");
        }


        /********* End *********/
    }

}
