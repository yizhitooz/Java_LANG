package case4;

public class overridingTest
{
    public static void main(String[] args)
    {
        // ʵ�����������s������talk()������ӡ��Ϣ
        /********* begin *********/
        Student s = new Student();
        s.name = "����";
        s.age = 18;
        s.university = "�����ѧ";
        s.talk();
        /********* end *********/

    }
}

class Person
{
    /********* begin *********/
    String name;
    int age;

    void work()
    {
        System.out.println("���෽����������");
    }

    void talk()
    {
        System.out.println("���෽����������");
    }
    /********* end *********/
}

class Student extends Person
{
    /********* begin *********/
    String university;

    @Override
    void work()
    {
        System.out.print("����" + university + "��ѧ");
    }

    void talk()
    {
        System.out.print("���ǣ�" + name + "�����꣺" + age + "�꣬");
        work();
    }
    /********* end *********/
}