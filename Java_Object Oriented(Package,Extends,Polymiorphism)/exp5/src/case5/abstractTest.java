package case5;

public class abstractTest
{
    public static void main(String[] args)
    {
        /********* begin *********/
        // �ֱ�ʵ����Student����Worker��Ķ��󣬲����ø��Թ��췽����ʼ�������ԡ�
        Student c = new Student("����", 20, "ѧ��");
        Worker w = new Worker("����", 30, "����");
        // �ֱ���ø������б���д��talk()���� ��ӡ��Ϣ��
        c.talk();
        w.talk();
        /********* end *********/

    }
}

// ����һ����ΪPerson�ĳ����࣬��Person����������������name age occupation��һ�����󷽷�����talk()��
abstract class Person
{
    /********* begin *********/
    String name;
    int age;
    String occupation;

    void talk()
    {
        System.out.print("������" + name + "�����䣺" + age);
    }
    /********* end *********/
}

// Student��̳���Person�࣬��Ӵ����������Ĺ��췽������дtalk()���� ���������������ְҵ��Ϣ
class Student extends Person
{
    /********* begin *********/
    public Student(String n, int a, String o)
    {
        name = n;
        age = a;
        occupation = o;
    }

    @Override
    void talk()
    {
        System.out.print(occupation + "����>");
        super.talk();
        System.out.print("��ְҵ��" + occupation + "��\n");
    }
    /********* end *********/
}

// Worker��̳���Person�࣬��Ӵ����������Ĺ��췽������дtalk()���� ���������������ְҵ��Ϣ
class Worker extends Person
{
    public Worker(String n, int a, String o)
    {
        name = n;
        age = a;
        occupation = o;
    }

    /********* begin *********/
    @Override
    void talk()
    {
        System.out.print(occupation + "����>");
        super.talk();
        System.out.print("��ְҵ��" + occupation + "��\n");
    }
    /********* end *********/

}