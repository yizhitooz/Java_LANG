//package step5;

import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����һ����Ȼ��N��");
        int N = sc.nextInt();//��ȡ���������N
        int sum = 1;
        /*****start*****/
        if (N == 0)
        {
            sum = 1;
        }
        else
        {
            for (int i = N; i > 0; i--)
            {
                sum *= i;
            }
        }

        /*****end*****/

        System.out.println("��Ȼ��N�Ľ׳�Ϊ" + sum);
    }
}
