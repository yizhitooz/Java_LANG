package step1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
        //��̬����arr1
        int[] arr1 = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< arr1.length ; i++)
        {
            arr1[i] = sc.nextInt();
        }
        /********** Begin **********/
        //��������arr2
        int[] arr2 = new int[arr1.length];
        //ʹ��forѭ����arr1�����ݸ��Ƹ�arr2
        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
        //���arr2
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
        /********** End **********/
    }
}
