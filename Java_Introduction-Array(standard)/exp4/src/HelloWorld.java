package step3;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[sc.nextInt()];

        //ѭ�������鸳ֵ
        for(int i = 0 ; i< scores.length;i++)
        {
            scores[i] = sc.nextInt();
        }
        /********** Begin **********/
        //�������������scores��ƽ��ֵ�����ֵ
        double avg_num;
        int max_num = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i]> max_num)
            {
                max_num = scores[i];
            }
            sum = sum + scores[i];
        }
        avg_num = (double)sum / scores.length;
        System.out.println("ƽ��ֵ��" + avg_num);
        System.out.println("���ֵ��" + max_num);
        /********** End **********/
    }
}
