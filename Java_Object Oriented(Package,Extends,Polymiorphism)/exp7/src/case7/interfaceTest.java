package case7;

public class interfaceTest
{
    public static void main(String[] args)
    {
        // ʵ����һStudent�Ķ���s��������talk()��������ӡ��Ϣ
        /********* begin *********/
        Student s = new Student();
        s.talk();
        /********* end *********/

    }
}

// ����һ��Person�ӿڣ�����������������������name��age��occupation�����ֱ�ֵ������һ���󷽷�talk()
interface Person
{
    /********* begin *********/
    String name = "����";
    int age = 20;
    String occupation ="ѧ��";
    default void talk()
    {
        System.out.print("������" + name + "�����䣺" + age);
    }
    

    /********* end *********/
}

// Student��̳���Person�� ��дtalk()�������������������ְҵ��Ϣ
class Student implements Person
{
    /********* begin *********/
    @Override
    public void talk()
    {
        System.out.print(occupation + "����>");
        Person.super.talk();
        System.out.print("��ְҵ��" + occupation + "��\n");
    }
    /********* end *********/
}