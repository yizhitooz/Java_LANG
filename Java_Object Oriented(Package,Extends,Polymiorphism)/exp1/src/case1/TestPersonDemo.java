package case1;

public class TestPersonDemo
{
    public static void main(String[] args)
    {
        /********* begin *********/
        // ������ʵ����һPerson����p
        Person p = new Person();
        // ��p�е����Ը�ֵ
        p.name = "����";
        p.age = 18;
        // ����Person���е�talk()����
        p.talk();
        /********* end *********/

    }
}

// �����ﶨ��Person��
class Person
{
    /********* begin *********/
    String name;
    int age;

    void talk()
    {
        System.out.println("���ǣ�" + this.name + "�����꣺" + this.age + "��");
    }

    /********* end *********/
}
