package case3;

public class superTest
{
    public static void main(String[] args)
    {
        // ʵ����һ��Student��Ķ���s��ΪStudent����s�е�school��ֵ����ӡ�����Ϣ
        /********* begin *********/
        Student s = new Student();
        s.name = "����";
        s.age = 18;
        s.university = "�����ѧ";
        s.show();
        /********* end *********/
    }
}

class Person
{
    /********* begin *********/
    String name;
    int age;
    /********* end *********/
}

class Student extends Person
{
    /********* begin *********/
    String university;

    void show()
    {
        System.out.println("������" + super.name + "�����䣺" + super.age + "��ѧУ��" + university);
    }
    /********* end *********/
}
