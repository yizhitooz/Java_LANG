package step4;

public class HelloWorld
{
    public static void main(String[] args)
    {

        int i = 0;

        while (i <= 20)
        {
            i++;
            /*****start*****/
            if (i%2==0)
            {
                System.out.println(i + "��ż��");
                continue;
            }
            System.out.println(i + "������");
            if (i == 13)
            {
                break;
            }
            /*****end*****/
        }


    }
}
