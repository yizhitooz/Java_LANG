//package setp17;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    /********** Begin **********/
    /**
     * ��һ�⣺����һ������ ���������������͵Ĳ��� a��b�������������ĺ�  ����ֵ����Ϊint ������Ϊ��getSum
     */
    public static int getSum(int a,int b)
    {
        return a+b;
    }
    /**
     * �ڶ��⣺ ����һ������ ��������double���Ͳ���a��b��c�� ��������������ƽ��ֵ ����ֵ����Ϊdouble ������Ϊ��getAvg
     */
    public static double getAvg(double a,double b,double c)
    {
        return (a+b+c)/3;
    }
    /**
     * �����⣺ ����һ������ ������������ a ��b ��ӡa�� b�е�һ������  ����Ҫ����ֵ   ������Ϊ��printRect
     */
    public static void printRect(int a,int b)
    {
        for (int i =0;i<a;i++)
        {
            for (int j =0;j<b;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * �����⣺����һ�������������������� Ϊ����  ��������������������  ������������ ����Ҫ����ֵ ������Ϊ sortArr
     */
    public static void sortArr(int []array)
    {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    /**
     *  ������
     * ��ֻ��Ҫʵ��for ѭ�����ŵ����ݾͿ� ����ӡ���ϵͳ�Ѿ��������
     */
    public static void Print99()
    {
        for (int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
    /********** End **********/


}
