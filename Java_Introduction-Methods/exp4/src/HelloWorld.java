//package step3;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();   //��ȡ��һ�����������
        int j = sc.nextInt();	//��ȡ�ڶ������������

        /********** Begin **********/
        //��������÷�����ȡ����ֵ

        System.out.println( i+"��"+j+"�Ƚϣ����ֵ�ǣ�"  +getMax(i,j));
        /********** End **********/
    }

    /*�����ﴴ��getMax������������������Ϊ�������������������нϴ��ֵ*/

    /********** Begin **********/
    public static int getMax(int pre,int post)
    {
        if (pre>=post)
            return  pre;
        else
            return post;
    }


    /********** End **********/
}