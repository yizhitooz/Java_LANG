//package setp7;
public class HelloWorld {

    public static void main(String[] args) {
        /********** Begin **********/

        // ����calcAvg()��������������ֵ�����ڱ���avg��
        double avg = calcAvg();

        /********** End **********/
        System.out.println("ƽ���ɼ�Ϊ��" + avg);
    }

    // ����һ������ֵΪdouble���͵ķ���
    /********** Begin **********/
    public static double calcAvg()
    {
        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2; // ����ƽ��ֵ
        return avg;
        // ʹ��return����ֵ


        /********** End **********/
    }
}