//package chapter2.step7;

import java.util.Scanner;

/********* Begin *********/


public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("��¼���϶������Ϣ��");
        System.out.println("������������");
        String name = input.next();
        System.out.println("���������䣺");
        int age = input.nextInt();
        System.out.println("�������Ա�");
        String sex = input.next();
        System.out.println("���������أ�");
        double weight = input.nextDouble();
        System.out.println("�������ַ��");
        String address = input.next();
        System.out.println("�������Ƿ��ѻ飺");
        String is_marry = input.next();

        System.out.println("��Ϣ���£�");
        System.out.println("\t������"+name);
        System.out.println("\t���䣺"+age+"��");
        System.out.println("\t�Ա�"+sex);
        System.out.println("\t���أ�"+weight+"kg");
        System.out.println("\t��ַ��"+address);
        System.out.println("\t���"+is_marry);
        /********* End *********/
    }
}