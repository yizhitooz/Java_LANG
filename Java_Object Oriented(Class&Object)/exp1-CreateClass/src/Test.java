package step1;

public class Test
{
    public static void main(String[] args)
    {
        /********** Begin **********/
        //����Dog����
        //����Dog���������
        Dog wuhuarou = new Dog();
        wuhuarou.name = "�廨��";
        wuhuarou.color = "��ɫ";
        wuhuarou.breed = "����˹��";
        //���С��������
        System.out.println("���֣�" + wuhuarou.name + "��ëɫ��" + wuhuarou.color + "��Ʒ�֣�" + wuhuarou.breed);

        //���÷���
        wuhuarou.act_eatBond();
        wuhuarou.act_runWithBond();

        /********** End **********/

    }
}

//�����ﶨ��Dog��

/********** Begin **********/
class Dog
{
    String name;
    String color;
    String breed;

    void act_eatBond()
    {
        System.out.println("�й�ͷ");
    }

    void act_runWithBond()
    {
        System.out.println("���Ź�ͷ��");
    }
}


/********** End **********/