//package setp9;

import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt(); //��һ�ųɼ�
        int score2 = sc.nextInt(); //�ڶ��ųɼ�
        /********** Begin **********/
        // ���÷������������ſγ̵ĳɼ�
        calcAvg(score1,score2);

        /********** End **********/
    }

    /*
     * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
     * ����һ���������������ķ����������������ſγ̵ĳɼ�
     */

    /********** Begin **********/
    public static double calcAvg(double pre,double post)
    {
        double avg = (pre + post) / 2; // ����ƽ��ֵ
        //int avg_int =(int)(avg);
        System.out.println("ƽ���֣�"+(int)(avg));
        return avg;
        // ʹ��return����ֵ
        /********** End **********/
    }


    /********** End **********/

}