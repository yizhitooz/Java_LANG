package step4;

import java.util.Scanner;

public class Test
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String theMa = sc.next();
        int quantity = sc.nextInt();
        boolean likeSoup = sc.nextBoolean();
        /********** Begin **********/
        //ʹ�����������Ĺ��췽������WuMingFen����  ȡ�� f1
        WuMingFen f1 = new WuMingFen(theMa, quantity, likeSoup);
        //ʹ�����������Ĺ��췽������WuMingFen����  ȡ�� f2
        WuMingFen f2 = new WuMingFen(theMa, quantity);
        //ʹ���޲ι��췽������WuMingFen����  ȡ�� f3
        WuMingFen f3 = new WuMingFen();
        //�ֱ����������� check����
        f1.check();
        f2.check();
        f3.check();
        /********** End **********/
    }
}
