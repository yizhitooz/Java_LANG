package case2;

public class extendsTest
{
    public static void main(String args[])
    {
        // ʵ����һ��Cat������������name��age������voice()��eat()�������ٴ�ӡ�����ֺ�������Ϣ
        /********* begin *********/
        Cat c = new Cat();
        c.name = "��è";
        c.age = 6;
        c.voice();
        c.eat();
        System.out.println(c.name + c.age+"��");
        /********* end *********/

        // ʵ����һ��Dog������������name��age������voice()��eat()�������ٴ�ӡ�����ֺ�������Ϣ
        /********* begin *********/
        Dog d = new Dog();
        d.name = "��ڹ�";
        d.age = 8;
        d.voice();
        d.eat();
        System.out.println(d.name + d.age+"��");
        /********* end *********/

    }
}

class Animal
{
    /********* begin *********/
    String name;
    int age;
    /********* end *********/

}

class Cat extends Animal
{
    // ����Cat���voice()��eat()����

    /********* begin *********/
    void voice()
    {
        System.out.println(name + "������");
    }

    void eat()
    {
        System.out.println(name + "����");
    }
    /********* end *********/
}

class Dog extends Animal
{
    // ����Dog���voice()��eat()����

    /********* begin *********/
    void voice()
    {
        System.out.println(name + "������");
    }

    void eat()
    {
        System.out.println(name + "�Թ�ͷ");
    }
    /********* end *********/
}