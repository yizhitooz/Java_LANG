package step3;

public class HelloWorld
{
    public static void main(String[] args)
    {
        int count = 0;    //��������洢6�ı������ֵĴ���
        /*****start*****/
        int begin,i = 1;
        int end = 100;
        do
        {
            if (i%6==0)
            {
                count++;
            }
            i++;
        }
        while(i<=end);
        /*****end*****/
        System.out.println("6�ı������ֵĴ���Ϊ��" + count);
    }
}
