package step2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


        /********** Begin **********/
        //�����ﶨ��һ������Ϊ4���ַ������飬�������ѧ������
        String[] stuNames = new String[4];

        //�������stuNames���鸳ֵ  �ֱ�Ϊ   ����,���޼�,������,����ɽ
        stuNames[0] = "����";
        stuNames[1] = "���޼�";
        stuNames[2] = "������";
        stuNames[3] = "����ɽ";
        //���������stuNames�����е�����
        System.out.println("�����еĵ�һ������Ϊ��" + stuNames[0]);
        System.out.println("�����еĵڶ�������Ϊ��" + stuNames[1]);
        System.out.println("�����еĵ���������Ϊ��" + stuNames[2]);
        System.out.println("�����еĵ��ĸ�����Ϊ��" + stuNames[3]);


        int[] scores;
        Scanner sc = new Scanner(System.in);
        //������ʹ��Scanner��ȡϵͳ���������,���û�ȡ��������������scores����ĳ���
        int length = sc.nextInt();
        scores = new int[length];
        /********** End **********/

        System.out.println("����scores�ĳ���Ϊ��" + scores.length);
    }
}
