package step3;

public class HelloWorld
{
    public static void main(String[] args)
    {
        int count = 0;    //定义变量存储6的倍数出现的次数
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
        System.out.println("6的倍数出现的次数为：" + count);
    }
}
