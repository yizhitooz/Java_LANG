package step2;

public class Task
{
    public static void main(String[] args)
    {

//���ڴ����ʵ�ִ���
/********** Begin **********/
// ����int���ͱ�����ֵΪ67
        int score = 67;

        // ����Integer��װ����󣬱�ʾ����score��ֵ
        Integer score1 = new Integer(score);

        // ��Integer��װ��ת��Ϊdouble����
        double score2 = score1.doubleValue();

        // ��Integer��װ��ת��Ϊfloat����
        float score3 = score1.floatValue();

        // ��Integer��װ��ת��Ϊint����
        int score4 = score1.intValue();

        System.out.println("Integer��װ�ࣺ" + score1);
        System.out.println("double���ͣ�" + score2);
        System.out.println("float���ͣ�" + score3);
        System.out.println("int���ͣ�" + score4);


/********** End **********/

    }
}
