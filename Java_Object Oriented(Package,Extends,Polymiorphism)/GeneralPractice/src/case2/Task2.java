package case2;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String cName = sc.next();
        String cSex = sc.next();
        int cAge = sc.nextInt();
        String eName = sc.next();
        String eSex = sc.next();
        int eAge = sc.nextInt();
        // �������������test
        // ����Person�����person1,����ָ���й���,ͨ���вι��캯��ʵ�����й��������
        // ͨ��showEat()��������Chinese��eat()����
        // ����Person�����person2,����ָ��Ӣ����,ͨ���вι��캯��ʵ����Ӣ���������
        // ͨ��showEat()��������English��eat()����
        /********* begin *********/
        Person person1 = new Chinese(cName, cSex, cAge);
        person1.eat();
        Person person2 = new English(eName, eSex, eAge);
        person2.eat();
        /********* end *********/
        // ǿ������ת��(����ת��) ����Chinese�����еķ���shadowBoxing()
        // ǿ������ת��(����ת��) ����English�����еķ���horseRiding()
        /********* begin *********/
        Chinese chinese1 = (Chinese) person1;
        chinese1.shadowBoxing();
        English english2 = (English) person2;
        english2.horseRiding();
        /********* end *********/
    }

    // ����showEat������ʹ�ø�����Ϊ�������βΣ�ʵ�ֶ�̬����������ĸ��������͵����ĸ������eat()����

    /********* begin *********/
    void showEat(Person person)
    {
        person.eat();
    }
    /********* end *********/
}

// ������Person ��װ����name��sex��age
// ���캯����ʼ��name��sex��age
// �������󷽷�eat()
abstract class Person
{
    /********* begin *********/
    String name;
    String sex;
    int age;

    abstract void eat();
    /********* end *********/
}

// Chinese��̳���Person��
// ���캯����ʼ��name��sex��age
// ��д���෽��eat() ���'������name���Ա�sex�����䣺age�������й��ˣ���ϲ���Է���'
// �����������з���shadowBoxing(),����������ָ���������ʱ�޷����ø÷��� ���'name����ϰ̫��ȭ��'
class Chinese extends Person
{
    /********* begin *********/
    public Chinese(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    void eat()
    {
        System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age + "�������й��ˣ���ϲ���Է���");
    }

    void shadowBoxing()
    {
        System.out.println(name + "����ϰ̫��ȭ��");
    }
    /********* end *********/
}

// English��̳���Person��
// ���캯����ʼ��name��sex��age
// ��д���෽��eat() ���'name����ϰ����������Ӣ���ˣ���ϲ����������!'
// �����������з���horseRiding(),����������ָ���������ʱ�޷����ø÷��� ���'name����ϰ����'
class English extends Person
{
    /********* begin *********/
    public English(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    void eat()
    {
        System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age + "������Ӣ���ˣ���ϲ���������Σ�");
    }

    void horseRiding()
    {
        System.out.println(name + "����ϰ����");
    }
    /********* end *********/
}