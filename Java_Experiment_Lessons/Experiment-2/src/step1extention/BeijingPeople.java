package step1extention;

public class BeijingPeople extends ChinaPeople
{
    //������4����дpublic void averageHeight()����,���:"�����˵�ƽ�����: 172.5����"
    //������5����дpublic void averageWeight()����,���:"�����˵�ƽ�����أ�70����"
    public void beijingOpera()
    {
        System.out.println("���������¡�����������");
    }

    @Override
    public void averageHeight()
    {
        System.out.println("�����˵�ƽ�����: 172.5����");
    }

    @Override
    public void averageWeight()
    {
        System.out.println("�����˵�ƽ�����أ�70����");
    }
}

