//package setp10;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args)
    {

        int[] scores={79,52,98,81};
        /********** Begin **********/
        //���÷���������ɼ����飬����ȡ�ɼ��ĸ���
        int count= HelloWorld.sort(scores);
        /********** End **********/
        System.out.println("����"+count+"���ɼ���Ϣ��");
    }

    /*
     * ���ܣ������Գɼ�������������سɼ��ĸ���
     *
     */
    /********** Begin **********/
    public static int sort(int[] array)
    {
        // �����С����������
        Arrays.sort(array);
        // ��ӡ������
        System.out.println(Arrays.toString(array));
        //����������Ԫ�صĸ���
        return array.length;
    }
    /********** End **********/
}