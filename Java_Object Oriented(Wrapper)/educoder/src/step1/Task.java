package step1;

public class Task
{
    public static void main(String[] args)
    {

//���ڴ����ʵ�ִ���
/********** Begin **********/
//����float����
        float f = 66.6f;

        //�ֶ�װ��
        Float f1 = new Float(f);

        //�Զ�װ��
        Float f2 = f;

        System.out.println("װ���Ľ��Ϊ��" + f1 + "��" + f2);


        //����һ��Double��װ��ֵΪ88.88
        Double d = new Double(88.88);

        //�ֶ�����
        double d1 = d.doubleValue();

        //�Զ�����
        double d2 = d;

        System.out.println("������Ϊ��" + d1 + "��" + d2);


/********** End **********/

    }

}
