package step3;

public class Task
{
    public static void main(String[] args)
    {
        double a = 78.5;

//���ڴ����ʵ�ִ���
/********** Begin **********/
//����������aת��Ϊ�ַ���
        String str = String.valueOf(a);

        System.out.println("str + 12  �Ľ��Ϊ�� " + (str + 12));

        String str1 = "180.20";
        // ���ַ���str1ת��Ϊ��������
        double d = Double.valueOf(str1);

        System.out.println("d + 100 �Ľ��Ϊ�� " + (d + 100));

/********** End **********/


    }
}
